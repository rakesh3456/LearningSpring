package com.ibm.app.jpa.onetomany;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "order_details")
public class OrderDetails {
    @Id
    private Long id;

    @Column
    private Date createdOn;

    @Column
    private String createdBy;

    //primary key and forg
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "product_id")
    private ProductDetails productDetails;

}