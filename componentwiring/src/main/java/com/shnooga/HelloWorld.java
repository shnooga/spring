package com.shnooga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String name = "Muttley";

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }

}
