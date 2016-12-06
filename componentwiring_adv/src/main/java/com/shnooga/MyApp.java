package com.shnooga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyApp {

    @Autowired
    private HelloWorld helloWorld;

    @Bean
    public HelloWorld getInky()     { return new HelloWorld("Inky"); }
    public HelloWorld getClyde()    { return new HelloWorld("Clyde"); }

//    public HelloWorld getHelloWorld() {
//        return helloWorld;
//    }

    private void run() {helloWorld.printHello();}

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        MyApp bean = (MyApp) context.getBean("myApp");

        bean.run();

//        bean.getHelloWorld().printHello();
    }
}
