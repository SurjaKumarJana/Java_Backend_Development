package org.surja.product_service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    // currently storing the items in jvm , for simplification we don't add the db now
    private Map<Long,Product> productStore = new HashMap<>();

    private AtomicLong nextId = new AtomicLong(1);

    public Product createProduct(Product product){
        product.setId(nextId.getAndIncrement());
        productStore.put(product.getId(), product);
        return product;
    }

    public Product getProductById(Long id){
        return productStore.get(id);
    }
    public List<Product> getAll(){
        return productStore.values().stream().toList();
    }

}
