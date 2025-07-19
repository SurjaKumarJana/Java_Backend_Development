package org.surja.spring_boot_L08_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FlightSearchService {
    @Value("${indigo.url}")
    //helps inject external configuration values into your Spring beans.
    //The application.properties file allows us to run an application in a different environment.

    //"${indigo.url}" is a Spring Expression Languages (SpEL):
    //here Inject the value of the property key indigo.url from the application.properties
    private String indigoUrl;

    public String callIndigoApiForData(){
//        System.out.println(indigoUrl);
        return  indigoUrl;
    }

}
