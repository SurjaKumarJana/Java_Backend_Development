package org.surja.logging_mvc_annotations_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.surja.loginService.LoginSessions;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    private Logger LOGGER = LoggerFactory.getLogger(AppController.class );

    @Autowired
    private ProductService productService;
    @Autowired(required = false)
    private LoginSessions loginSessions;


    @GetMapping("/hello")
    public String sayHello(){
        LOGGER.info(" sayHello method is called..");
        return "Hello from : "+Thread.currentThread().getName();
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        LOGGER.info("Processing the request of getAll product...");
        return productService.getAll();
    }

    @GetMapping("/getById")
    public Product getById(@RequestParam int id){
        LOGGER.info("Processing the request of get a product by the id");
        return productService.getById(id);
    }

    @GetMapping("/sessions")
    public String getSesssionDetails(){
        LOGGER.info("Processing the request of session details...");
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
        LOGGER.info("Proccessing the reqest to add a Product..");
        return productService.createProduct(product);
    }



}
