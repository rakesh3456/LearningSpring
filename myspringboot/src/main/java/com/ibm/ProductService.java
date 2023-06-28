
package com.ibm;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String findAll() {
        return "Products";
    }

    public String save() {
        return "Save";
    }

    public String update() {
        return "update";
    }
}
