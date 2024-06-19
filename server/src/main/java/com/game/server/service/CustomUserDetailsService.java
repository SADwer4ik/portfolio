package com.game.server.service;

import com.game.server.Repository.UserRepository;
import com.game.server.model.User;
import com.game.server.payLoad.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(userRepository.findByName(username));
        return user.map(CustomUserDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException(username + " not found"));
    }
}
