package com.shnooga.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Use @Component to signify Spring Bean
@Component
public class Plate {
    private String shape;

    // Specify which bean to create with qualifier
    @Autowired
    @Qualifier(value = "chiliBean")
    private BeanIntf bean;

    // Simplified bean creation by using bean name as property name.
    @Autowired
    private BeanIntf jellyBean;

    public Plate() {} // Spring needs a default constructor
    public Plate(String shape) { this.shape = shape; }

    public String getShape() { return shape; }

    public void showContent() {
        System.out.println(shape + " plate has " + jellyBean.getBehavior() + " " + jellyBean.getName());
        System.out.println(shape + " plate has " + bean.getBehavior() + " " + bean.getName());
    }
}
