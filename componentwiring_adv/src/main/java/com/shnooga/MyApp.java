package com.shnooga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyApp {

    // Use @Autowired to avoid defining setter/getter for helloWorld
    @Autowired
    // Use @Qualifier to let Spring know which method to use to create a HelloWorld instance.
    @Qualifier("clyde")
    private HelloWorld helloWorld;

    // Use name to refer to the desired HelloWorld instantiator
    @Bean(name="inky")
    public HelloWorld getInky()     { return new HelloWorld("Inky"); }
    @Bean(name="clyde")
    public HelloWorld getClyde()    { return new HelloWorld("Clyde"); }

    private void run() {helloWorld.printHello();}

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        MyApp bean = (MyApp) context.getBean("myApp");

        bean.run();
    }
}
