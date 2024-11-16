package com.Tutorial.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compile with 404 Laptop");
    }
}
