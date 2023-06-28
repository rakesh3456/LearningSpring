package com.ibm.spring.app.annotations.sterotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StroTypeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansStereotype.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);
    }
}
