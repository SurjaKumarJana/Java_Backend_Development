package org.surja;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//to add a class to the bean we have to use the @Component annotation
@Component // direct access
@Service // in directly access
public class SmsGatewayService {

    public SmsGatewayService() {
    }

    public void sendSms(String sms){
        System.out.println("Sending : " + sms);
    }

    //@PostConstruct init method
    public void init(){
        System.out.println("Executing init method");
    }

    //@PreDestroy destroy method
    public void destroy(){
        System.out.println("Executing destroy method");
    }
}
