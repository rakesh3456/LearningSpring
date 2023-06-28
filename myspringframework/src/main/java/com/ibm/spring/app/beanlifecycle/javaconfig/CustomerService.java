package com.ibm.spring.app.beanlifecycle.javaconfig;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public String findAll() {
        return "Customer Service";
    }
}
