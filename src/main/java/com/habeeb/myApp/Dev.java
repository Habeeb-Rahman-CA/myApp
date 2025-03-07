package com.habeeb.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Connect the Laptop.java to Dev.java (Field Injection)
    private Laptop laptop;

    // public Dev(Laptop laptop) { // Another way to connect laptop to dev (Constructor Injection)
    //     this.laptop = laptop;
    // }

    @Autowired
    public void setLaptop(Laptop laptop){ // Another way of DI (Setter Injection)
        this.laptop = laptop;
    }

    public void build() {
        laptop.compile();
        System.out.println("Working on Java Project");
    }
}
