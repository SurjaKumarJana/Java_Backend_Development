package org.surja.spring_security_demo.controller;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.surja.spring_security_demo.entity.AppUser;
import org.surja.spring_security_demo.service.AppUserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AppUserService userService;



    @GetMapping("/hello")
    public String adminSecificApi(@AuthenticationPrincipal AppUser user){

        return "Hello ADMIN ! "+ user.getName() +" from "+Thread.currentThread().getName();
    }

    // all post request can not be directly call
    // even admin also unable to create use in spite of having all the access
    // we need to modify the csrf functionality
    @PostMapping("/createUser")
    public String creatUser(@RequestBody AppUser appUser){

        return userService.createUser(appUser);
    }


}
