package com.springexercises.aop.validationaspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValidationAspectMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Service service = context.getBean("service", Service.class);

        // invalid id
        System.out.println("setNewApiKeyAndId: " +
                service.setNewIdAndApiKey(-24, "w3r-fwg-f32")
        );
        System.out.println(service + "\n");

        // invalid apiKey
        System.out.println("setNewApiKeyAndId: " +
                service.setNewIdAndApiKey(2, "w3r-f32")
        );
        System.out.println(service + "\n");

        // valid data
        System.out.println("setNewApiKeyAndId: " +
                service.setNewIdAndApiKey(19, "w3r-fwg-f32")
        );
        System.out.println(service);
    }
}
