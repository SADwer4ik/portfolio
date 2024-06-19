package com.game.server.Controller;

import com.game.server.Repository.RoleRepository;
import com.game.server.exception.BadCredentialError;
import com.game.server.model.User;
import com.game.server.Repository.UserRepository;
import com.game.server.model.role.Role;
import com.game.server.model.role.RoleName;
import com.game.server.payLoad.CustomUserDetails;
import com.game.server.payLoad.JwtRequest;
import com.game.server.payLoad.JwtResponse;
import com.game.server.payLoad.JwtTokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class HelloController {


    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    private JwtTokenUtils jwtTokenUtils;
    @Autowired
    HelloController(UserRepository userRepository,
                    RoleRepository roleRepository,
                    PasswordEncoder passwordEncoder,
                    JwtTokenUtils jwtTokenUtils
                    ){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;

        this.jwtTokenUtils = jwtTokenUtils;
    }
    @GetMapping("/hello")

    private String world(){

        return "Hello world";
    }
    @GetMapping("/www")
    public  String www(){
        return "admin";
    }

    @PostMapping("/signup")
    private ResponseEntity<?> helloPost(@RequestBody User user){
        List<Role> roles = new ArrayList<>();
        if (userRepository.count() == 0){
            roles.add(roleRepository.findByName(RoleName.USER));
            roles.add(roleRepository.findByName(RoleName.ADMIN));
        }
        else{
            roles.add(roleRepository.findByName(RoleName.USER));
        }
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        String token = jwtTokenUtils.generateToken(new CustomUserDetails(user));
        return ResponseEntity.ok(token);
    }
    @PostMapping("/signin")
    private ResponseEntity<?> signInReq(@RequestBody JwtRequest request) {

        UserDetails userDetails = new CustomUserDetails(userRepository.findByName(request.username()));
        String token = jwtTokenUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }
}
