package com.shnooga;

public class ChiliBean implements  BeanIntf {
    public String getBehavior() {
        return "spicy";
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
