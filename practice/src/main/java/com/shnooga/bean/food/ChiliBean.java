package com.shnooga.bean.food;

// @Component not needed because already declared in BeanIntf
public class ChiliBean implements  BeanIntf {
    public String getBehavior() { return "spicy"; }
    public String getName() { return getClass().getSimpleName(); }
}
