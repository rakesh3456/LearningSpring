package com.ibm.app.jpa.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductDetails, Long> {

    List<ProductDetails> findAll();
}
