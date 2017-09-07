package com.shnooga;

import com.shnooga.bean.BeanIntf;
import com.shnooga.bean.ChiliBean;
import com.shnooga.bean.JellyBean;
import com.shnooga.bean.Plate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

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
}
