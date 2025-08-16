package org.surja.spring_security_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello ! from : "+ Thread.currentThread().getName();
    }



}
