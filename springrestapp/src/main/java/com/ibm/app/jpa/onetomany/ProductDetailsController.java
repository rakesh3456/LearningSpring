package com.ibm.app.jpa.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductDetailsController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value="/productDetails")
    public ResponseEntity<List<ProductDetails>> getProductDetails(){
        List<ProductDetails> prodList=productRepository.findAll();
        return new ResponseEntity<List<ProductDetails>>(prodList,HttpStatus.OK);
    }
}
