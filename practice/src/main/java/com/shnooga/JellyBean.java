package com.shnooga;

public class JellyBean implements  BeanIntf {
    public String getBehavior() {
        return "sweet";
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
