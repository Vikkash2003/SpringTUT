package com.Tutorial.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired  //field injection
    private Computer comp;

//    public Dev(Laptop laptop){     // constructor injection is default
//        this.laptop = laptop;
//    }

//    @Autowired  // for setter and field injections implementation used Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();
        System.out.println("working on awesome project");
    }


}
