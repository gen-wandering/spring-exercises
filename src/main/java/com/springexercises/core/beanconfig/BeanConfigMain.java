package com.springexercises.core.beanconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanConfigMain {
    public static void main(String[] args) {

        BeanFactory beanFactory = mixConfig();

        MessageService messageService = beanFactory.getBean("messageService", MessageService.class);
        System.out.println(messageService.getMessage());
    }

    // ClassPathXmlApplicationContext to load the XML-based configuration
    private static BeanFactory xmlConfig() {
        return new ClassPathXmlApplicationContext("core/beanconfig/applicationContext.xml");
    }

    // FileSystemXmlApplicationContext to load the XML-based configuration from an external file
    private static BeanFactory xmlConfigFromExternalFile() {
        String someExternalFile = "src/main/java/com/springexercises/parta/beanconfig/externalAppContext.xml";
        return new FileSystemXmlApplicationContext(someExternalFile);
    }

    // AnnotationConfigApplicationContext to load the Java-based configuration
    private static BeanFactory javaConfig() {
        return new AnnotationConfigApplicationContext(AppConfig.class);
    }

    // ClassPathXmlApplicationContext for mix of XML and Java configuration
    private static BeanFactory mixConfig() {
        return new ClassPathXmlApplicationContext("core/beanconfig/mixedAppContext.xml");
    }
}
