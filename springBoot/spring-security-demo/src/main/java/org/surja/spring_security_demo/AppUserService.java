package org.surja.spring_security_demo;

import jakarta.annotation.PostConstruct;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AppUserService implements UserDetailsService {

    Map<String,UserDetails> userStore  = new HashMap<>();

    @PostConstruct
    public  void init(){
        userStore.put("Surja", User.builder().username("Surja").password("Surja121").roles("ADMIN").build());
        userStore.put("Rahul", User.builder().username("Rahul").password("Rahul121").roles("USER").build());

    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails user = userStore.get(username);
        if(user == null){
            throw new UsernameNotFoundException("No user found with this name ");
        }


        return user;
    }
}
