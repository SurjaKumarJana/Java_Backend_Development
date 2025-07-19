package org.surja.spring_boot_L08_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.surja.keywordAnalyser.KeywordAnalyserInterface;

import java.util.List;

@RestController //special type of controller in Spring Boot used for building RESTful web services.
//Tells Spring that the class is a controller that handles HTTP requests.

@RequestMapping("/app") //This annotation is used to map HTTP requests
// to handler methods or controller classes in Spring MVC.
public class AppController {

    @Autowired
    private FlightSearchService flightSearchService;
    @Autowired
    private ProductService productService;
    @Autowired
    private KeywordAnalyserInterface keywordAnalyser;


    @GetMapping("/hello") //It is used to handle HTTP GET requests in Spring MVC (commonly used to read data).
    public String sayHello() {
        return "Hello from : " + Thread.currentThread().getName();
    }

    @GetMapping("/flightData")
    public String flightData() {
        return flightSearchService.callIndigoApiForData();
    }

    @GetMapping("/getProduct")
    public Product getProduct(@RequestParam String key) {
        keywordAnalyser.recordKeyword(key);
        return productService.getProduct(key);
    }

    @GetMapping("/getAll")
    public List<String> getAllKeyWord() {
        return keywordAnalyser.getKeyword();
    }


}
