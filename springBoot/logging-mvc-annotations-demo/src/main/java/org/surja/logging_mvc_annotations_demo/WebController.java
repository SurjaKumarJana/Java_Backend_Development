package org.surja.logging_mvc_annotations_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/web")
public class WebController {

    private static Logger LOGGER = LoggerFactory.getLogger(WebController.class);
    @Autowired
    private ProductService productService;

    @GetMapping("/dynamic-list")
    public ModelAndView getList(){
        LOGGER.info("generating dynamic list ");
        List<Product> productList = new ArrayList<>();
        productList.addAll(productService.getAll());

        ModelAndView modelAndView = new ModelAndView("dynamic-page.html");
        modelAndView.getModelMap().put("products", productList);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        modelAndView.getModelMap().put("serverTime", dateFormat.format(new Date()));

        return modelAndView;
    }

    @GetMapping("/static-list")
    public String redirectToStaticPage() {
        return "redirect:/static-page.html";
        /*
        In Spring Boot, we use the redirect: prefix in a controller's return value
        to tell the framework not to render a view. Instead, it should send an HTTP
        redirect response to the client, so the browser makes a new request to a
        different URL.
         */
    }
}
