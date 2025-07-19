package org.surja.spring_boot_L08_demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service //Marks a class as a service (business logic) bean managed by Spring.
/*
 * @Service => Use for classes that contain business logic.
 * @Component => Use for helper, utility, or general-purpose classes.
 * Both are Spring beans and can be injected using @Autowired.
 */

public class ProductService {

    private Map<String , Product> dataStore;

    @PostConstruct //Run this method automatically after the bean is created and dependencies are injected
    public void init(){
        dataStore = new HashMap<>();
        dataStore.put("Laptop",new Product("Laptop",71000.90));
        dataStore.put("Mobile",new Product("Mobile",67000));
        dataStore.put("Macbook",new Product("Macbook",255000.87));
    }

    public Product getProduct(String key){
        Product product = dataStore.get(key);
        return product;
    }

}
