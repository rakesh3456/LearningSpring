package com.ibm.spring.app.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredAnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansscanner.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);

    }
}
