package org.surja.restfull_api_service.dao;


import org.springframework.stereotype.Repository;
import org.surja.restfull_api_service.entity.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*
What is @Repository in Spring?

- @Repository is an annotation used to mark a class that directly accesses the database.
- This class usually contains methods like save(), update(), delete(), findById(), etc.

Why we use it?
- It tells Spring: "This class is for database work."
- Spring will create an object (bean) of this class automatically.
- It also helps in handling database-related errors properly.

Where is it used?
- In the DAO (Data Access Object) layer — where we write code to talk to the database.

*/

@Repository
public class ProductDAO {

    private Map<Integer, Product> dataStore = new HashMap<>();

    private AtomicInteger nextId = new AtomicInteger();

    public Product getById(int id){
        return dataStore.get(id);
    }

    public Product creat(Product product){
        product.setId(nextId.getAndIncrement());
        dataStore.put(product.getId(), product);
        return  product;
    }

    public Product update(Integer id, Product product){
        Product existingProduct = dataStore.get(id);
        if(existingProduct == null){
            return null;
        }
        existingProduct.setName(product.getName());
        existingProduct.setCost(product.getCost());
        return existingProduct;
    }

    public Product delete(Integer id){
        Product existingProduct = dataStore.get(id);
        if(existingProduct == null){
            return null;
        }
        dataStore.remove(id);
        return existingProduct;
    }

}
