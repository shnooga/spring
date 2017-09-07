package com.shnooga;

import com.shnooga.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.shnooga"})
public class Config {

    @Bean(name = "jellyBean")
    public BeanIntf createJellyBean() {return new JellyBean();}

    @Bean(name="chiliBean")
    public BeanIntf createChiliBean() {return new ChiliBean();}

    @Bean(name="squarePlate")
    public Plate createSquarePlate() {return new Plate("square");}

    @Bean(name="roundPlate")
    public Plate createRoundPlate() {return new Plate("round");}

    @Bean(name="knife")
    public Utensil createKnife() {return new Utensil("knife", "sharp");}

    @Bean(name="spoon")
    public Utensil createSpoon() {return new Utensil("spoon", "old");}
}
