package com.shnooga;

import com.shnooga.bean.Plate;
import com.shnooga.bean.Table;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Table table = ctx.getBean(Table.class);

        table.showContent();

        Plate rndPlate1 = (Plate) ctx.getBean("roundPlate");
        Plate rndPlate2 = (Plate) ctx.getBean("roundPlate");
        System.out.println("rndPlate1 and rndPlate2 are actually he same instance due to default singleton creation.");
    }
}
