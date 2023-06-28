package com.ibm.spring.app.di;

public class Customer {
    private int customerId;
    private String name;
    //Depedency
    private  Address address;

    public Customer() {
    }

    public Customer(Address address) {
        this.address = address;
    }

    public Customer(int customerId, String name, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
