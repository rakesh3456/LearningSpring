package com.ibm.spring.app.beanlifecycle.javaconfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public String findAll() {
        return "Product Service";
    }
}
