package com.game.server.config;

import com.game.server.payLoad.JwtTokenUtils;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.stream.Collectors;

@Component
public class JwtReqFilter extends OncePerRequestFilter {
    JwtTokenUtils jwtTokenUtils;
    @Autowired
    public JwtReqFilter(JwtTokenUtils jwtTokenUtils){
        this.jwtTokenUtils = jwtTokenUtils;
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        String jwt, username;
        jwt = username = null;
        String error;
        if (authHeader != null && authHeader.startsWith("Bearer ")){
            jwt = authHeader.substring(7);
            try{
                username = jwtTokenUtils.getUsername(jwt);
            }
            catch (ExpiredJwtException ex){
                error = "Время вышло";
            }
            catch (SignatureException ex){
                error = "Не корректная подпись";
            }
        }
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null){
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                    username,
                    null,
                    jwtTokenUtils.getRoles(jwt).stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList())
            );
            SecurityContextHolder.getContext().setAuthentication(token);
        }
        filterChain.doFilter(request, response);
    }
}
