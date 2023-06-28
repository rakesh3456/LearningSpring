package com.ibm.spring.app.annotations;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class Customer {
    private  int id;
    private String name;

    //life cycle methods
    @PostConstruct
    public void init(){
        System.out.println("Init");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Autowired
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
