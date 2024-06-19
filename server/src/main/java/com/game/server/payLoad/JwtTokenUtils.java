package com.game.server.payLoad;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.security.AlgorithmParameterGenerator;
import java.security.Key;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class JwtTokenUtils {

    String secret = "secret";
    @Value(value = "${jwt.validity}")
    Duration validity;

    public String generateToken(UserDetails userDetails){
        Map<String, Object> claims = new HashMap<>();
        List<String> roles = userDetails.getAuthorities()
                .stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
        claims.put("roles", roles);
        Date issuedDate = new Date();
        Date expiredDate = new Date(issuedDate.getTime() + validity.toMillis());


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(issuedDate)
                .setSubject(userDetails.getUsername())
                .setExpiration(expiredDate)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();

    }

    public String getUsername(String token){
        return getAllClaimsFromToken(token).getSubject();
    }
    public List<String> getRoles(String token){
        List<String> res = new ArrayList<>();

       return  getAllClaimsFromToken(token).get("roles", List.class);
    }

    private Claims getAllClaimsFromToken(String token){

        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

    }

}
