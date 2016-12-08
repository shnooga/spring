package com.shnooga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

    // Use @Autowired to avoid defining setter/getter for helloWorld
    @Autowired
    private HelloWorld helloWorld; // Autowire do not need setters

    private void run() {helloWorld.printHello();}

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        MyApp bean = (MyApp) context.getBean("myApp");

        bean.run();
    }
}
