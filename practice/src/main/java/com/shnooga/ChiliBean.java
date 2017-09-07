package com.shnooga;

public class ChiliBean implements  BeanIntf {
    public String getBehavior() {
        return "Spicy";
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
