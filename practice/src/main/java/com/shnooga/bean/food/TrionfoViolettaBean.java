package com.shnooga.bean.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("purpleBean")
public class TrionfoViolettaBean implements  BeanIntf {
    public String getBehavior() { return "purplish"; }
    public String getName() { return getClass().getSimpleName(); }
}
