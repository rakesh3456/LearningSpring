package com.ibm.spring.app.di.beanscope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PrototypeMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");

        ClientService clientService = null;
        clientService = factory.getBean("clientProtoService", ClientService.class);
        System.out.println(clientService.hashCode());
        clientService = factory.getBean("clientProtoService", ClientService.class);
        System.out.println(clientService.hashCode());
        clientService = factory.getBean("clientProtoService", ClientService.class);
        System.out.println(clientService.hashCode());
    }
}
