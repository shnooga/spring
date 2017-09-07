package com.shnooga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// Use @Configuration and @Bean to choose specific instantiator for a bean.
//@Configuration
// Use @ComponentScan to point to the class package of interest
@ComponentScan(basePackages = {"com.shnooga"})
public class MyApp {

    @Bean(name = "jelly")
    public BeanIntf createJellyBean() {return new JellyBean();}

    @Bean(name="pinto")
    public BeanIntf createPintoBean() {return new PintoBean();}

    @Bean(name="chili")
    public BeanIntf createChiliBean() {return new ChiliBean();}

    @Bean
    public Plate createPlate() {return new Plate();}

    public static void main(String[] args) {
        // No longer need a config.xml
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyApp.class);
        Plate plate = ctx.getBean(Plate.class);
        plate.showContent();
    }
}
