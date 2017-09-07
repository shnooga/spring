package com.shnooga;

public class PintoBean implements BeanIntf {
    public String getBehavior() {
        return "Protein";
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
