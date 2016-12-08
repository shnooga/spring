package com.shnooga;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String name = "Missing_Name";

    public HelloWorld() {} // Spring still needs this default constructor
    public HelloWorld(String name) { this.name = name; }
    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }

}
