package com.shnooga;

import org.springframework.stereotype.Component;

// Use @Component to avoid defining the bean in SpringBeans.xml
@Component
public class HelloWorld {
    private String name = "Muttley";

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }

}
