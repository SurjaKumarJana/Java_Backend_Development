package org.surja.spring_security_demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.surja.spring_security_demo.entity.AppUser;
import org.surja.spring_security_demo.repo.AppUserRepo;

import java.util.HashMap;
import java.util.Map;

@Service
public class AppUserService implements UserDetailsService {


    //now we are storing the user info in db
    @Autowired
    private AppUserRepo userRepo;

    @Autowired
    private PasswordEncoder encoder;



    public String createUser(AppUser appuser){
        appuser.setPassword(encoder.encode(appuser.getPassword()));
        userRepo.save(appuser);

        return "user created";
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = userRepo.findByEmail(username);
        if(appUser == null){
            throw new UsernameNotFoundException("User Does not exist");
        }
        return appUser;
    }
}
