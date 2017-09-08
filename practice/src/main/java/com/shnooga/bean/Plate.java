package com.shnooga.bean;

import com.shnooga.bean.food.BeanIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Use @Component to signify Spring Bean
public class Plate {
    private String shape;

    @Autowired
    @Qualifier(value = "chiliBean") // Specify which bean to create with @Qualifier
    private BeanIntf bean;

    @Autowired
    private BeanIntf jellyBean;     // Simplified bean creation by matching @Config's Bean name

    public Plate() {} // Spring needs a default constructor
    public Plate(String shape) { this.shape = shape; }

    public String getShape() { return shape; }

    public void showContent() {
        System.out.println("  " + shape + " plate has :");
        System.out.println("    " + jellyBean.getBehavior() + " " + jellyBean.getName());
        System.out.println("    " + bean.getBehavior() + " " + bean.getName());
    }
}
