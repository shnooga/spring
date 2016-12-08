package com.shnooga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    // Use @Autowired to avoid defining setter/getter for helloWorld
    @Autowired
    private HelloWorld helloWorld;

//    No need for setters with @AutoWired
//    public void setHelloWorld(HelloWorld helloWorld) { this.helloWorld = helloWorld;     }
//    public HelloWorld getHelloWorld() { return helloWorld; }

    private void run() {helloWorld.printHello();}

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        MyApp bean = (MyApp) context.getBean("myAppBean");

        bean.run();
    }
}
