package com.shnooga;

public class JellyBean implements  BeanIntf {
    public String getBehavior() {
        return "Sweet";
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
