package com.surja.aop_jdbc_demo.controller;


import com.surja.aop_jdbc_demo.entity.Product;
import com.surja.aop_jdbc_demo.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/product")
public class AppController {

    private static Logger LOGGER = LoggerFactory.getLogger(AppController.class);
    @Autowired
    private ProductService productService;


    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Integer id){
        LOGGER.info("Request for get product by id : "+id);
        Product product = productService.getById(id);
        if(product == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) throws URISyntaxException {
        LOGGER.info("Request for create product ");
        Product newProduct = productService.create(product);  // Save the product to DB
        String location = "/product/" + newProduct.getId();   // Build the URI of the newly created resource
        return ResponseEntity.created(new URI(location)).build();  // Return 201 Created with Location header
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product product){
        LOGGER.info("Request for update product by id : "+id);
        Product updatedProduct = productService.update(id, product);  // Try to update
        if (updatedProduct == null) {
            return ResponseEntity.notFound().build();  // 404 if product doesn't exist
        }
        return ResponseEntity.ok(updatedProduct);  // 200 OK with updated product
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Integer id){
        LOGGER.info("Request for delete product by id : "+id);
        Product deletedProduct = productService.delete(id);  // Try to delete
        if (deletedProduct == null) {
            return ResponseEntity.notFound().build();  // 404 if not found
        }
        return ResponseEntity.ok(deletedProduct);  // 200 OK with deleted product
    }




}
