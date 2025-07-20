package org.surja.logging_mvc_annotations_demo;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private ProductService productService;

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

    //post method
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }


}
