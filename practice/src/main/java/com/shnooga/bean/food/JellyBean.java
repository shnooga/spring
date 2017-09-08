package com.shnooga.bean.food;

// @Component not needed because already declared in BeanIntf
public class JellyBean implements  BeanIntf {
    public String getBehavior() { return "sweet"; }
    public String getName() { return getClass().getSimpleName(); }
}
