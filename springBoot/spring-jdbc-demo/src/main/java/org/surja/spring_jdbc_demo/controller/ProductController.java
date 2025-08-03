package org.surja.spring_jdbc_demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.surja.spring_jdbc_demo.entity.Product;
import org.surja.spring_jdbc_demo.service.ProductService;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;



    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable Long id){
        // Log start time of productService.getById, I have choice where to log it.
        Product product = productService.getById(id);
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) throws URISyntaxException {
        Product newProduct = productService.create(product);
        String location = "/product/" + newProduct.getId();
        return ResponseEntity.created(new URI(location)).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product updatedProduct = productService.update(id,product);
        if(updatedProduct==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id){
        Product deletedProduct = productService.delete(id);
        if(deletedProduct==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedProduct);
    }


    @GetMapping()
    public ResponseEntity<Product> getProductByIDInRequest(@RequestParam Long id){
        // Log start time of productService.getById, I have choice where to log it.
        Product product = productService.getById(id);
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }


}
