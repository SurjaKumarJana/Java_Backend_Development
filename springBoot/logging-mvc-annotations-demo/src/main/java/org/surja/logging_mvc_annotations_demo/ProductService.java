package org.surja.logging_mvc_annotations_demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init(){
        products.add(new Product(1,"Laptop"));
        products.add(new Product(2,"Mobile"));
        products.add(new Product(3,"Tab"));
        products.add(new Product(4,"Monitor"));
        products.add(new Product(5,"PC"));
    }



    public String createProduct(Product product){
        LOGGER.info("Creating Product: {} ",product);
        if(product.getName()==null){
            LOGGER.error("Product Name is null, can not create it");
            return "Product Name is null";
        }
        products.add(product);
        return  "Product Added Successfully...";
    }

    public List<Product> getAll(){
        LOGGER.info("fetch all the product info");
        return products;
    }

    public Product getById(int id){
        LOGGER.info("fetch product by id");
        return products.stream().filter(p->p.getId() == id).findFirst().orElse(null);
    }

}
