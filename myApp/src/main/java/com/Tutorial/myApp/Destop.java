package com.Tutorial.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // excute first like priority
public class Destop implements Computer {

    public void compile(){
        System.out.println("Compile with 404 faster");
    }
}
