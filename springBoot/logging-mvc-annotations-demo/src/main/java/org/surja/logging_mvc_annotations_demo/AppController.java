package org.surja.logging_mvc_annotations_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.surja.loginService.LoginSessions;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private ProductService productService;
    @Autowired(required = false)
    private LoginSessions loginSessions;


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from : "+Thread.currentThread().getName();
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/getById")
    public Product getById(@RequestParam int id){
        return productService.getById(id);
    }

    @GetMapping("/sessions")
    public String getSesssionDetails(){
        return loginSessions.getSessionDetails();
    }
    //path param
    @GetMapping("/product/{id}")
    public Product get(@PathVariable int id){
//        @PathVariable in Spring Boot is used to extract values from the URL path
        return productService.getById(id);
    }

    //post method
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }



}
