package com.shnooga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    @Autowired
    private HelloWorld helloWorld;

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

//    No need for setters with AutoWired
//    public void setHelloWorld(HelloWorld helloWorld) { this.helloWorld = helloWorld;     }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        MyApp bean = (MyApp) context.getBean("myAppBean");

        bean.getHelloWorld().printHello();
    }
}
