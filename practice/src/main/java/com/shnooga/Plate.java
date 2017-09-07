package com.shnooga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.shnooga"})
public class Plate {

    @Autowired
    @Qualifier("jelly")
    private BeanIntf bean;

    public void showContent() {
        System.out.println(bean.getName() + " is " + bean.getName());
    }
}
