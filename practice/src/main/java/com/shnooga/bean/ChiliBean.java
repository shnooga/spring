package com.shnooga.bean;

public class ChiliBean implements  BeanIntf {
    public String getBehavior() { return "spicy"; }
    public String getName() { return getClass().getSimpleName(); }
}
