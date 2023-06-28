package com.ibm.app.jpa.onetomany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "product_details")
public class ProductDetails {

    public ProductDetails(long id, String productName, String productDesc) {
        this.id = id;
        this.productName = productName;
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "productName")
    private String productName;

    @Column(name = "productDesc")
    private String productDesc;
}