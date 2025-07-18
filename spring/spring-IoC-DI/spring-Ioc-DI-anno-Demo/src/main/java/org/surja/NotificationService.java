package org.surja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    // this NotificationService depends on smsGatewayService
    // field based dependency injection
    // @Autowired
    private  SmsGatewayService smsGatewayService;

    //constructor based dependency injection

    public NotificationService(SmsGatewayService smsGatewayService) {
        this.smsGatewayService = smsGatewayService;
    }

    // setter based dependency injection
    //@Autowired
    public void setSmsGatewayService(SmsGatewayService smsGatewayService) {
        this.smsGatewayService = smsGatewayService;
    }

    public void sendSms(String sms){
        smsGatewayService.sendSms(sms);
    }

    public SmsGatewayService  getSmsGatewayService() {
        return smsGatewayService;
    }
}
