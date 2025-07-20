package org.surja.loginService;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "org.surja.logging-mvc-annotations-demo.loginSessions", name = "enable", havingValue = "true")

/*
this annotations is used when we want that a specific bean will be created when
a particular condition will be come true , here this bean will be created
when the havingValue became true

| Parameter        | Type       | Description                                                                |
|------------------|------------|------------------------------------------------------------------------ ---|
| prefix           | String     | The base path of the property key. Groups related properties.              |
| name             | String[]   | The property name(s) to check (appended to prefix).                        |
| havingValue      | String     | The value that the property must have for the bean to be registered.       |
| matchIfMissing   | boolean    | If true, bean is registered even when property is missing. Default is false|
*/


public class LoginSessions {

    public String getSessionDetails() {
        return "Session Details....";
    }
}
