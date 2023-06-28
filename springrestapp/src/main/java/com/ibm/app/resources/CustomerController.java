package com.ibm.app.resources;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    //apis
    //readAll
    @GetMapping(produces = {"application/json"})
    public String findAll() {
        return "Customers";
    }

    //Sub URL
    @GetMapping("/list")
//    @RequestMapping("/list")
    public String list() {
        return "Customer list";
    }


    @PostMapping
    //save
    public String save() {
        return "Save";
    }

    @PutMapping
    //update
    public String update() {
        return "update";
    }

    @DeleteMapping
    //remove
    public String remove() {
        return "Delete";
    }
}
