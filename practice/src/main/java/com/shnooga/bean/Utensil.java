package com.shnooga.bean;

// @Component not needed because already declared in Config.java
public class Utensil {
    private String behavior;
    private String name;

    public Utensil() { }
    public Utensil(String name, String behavior) {
        this.name = name;
        this.behavior = behavior;
    }

    public String getBehavior() { return behavior; }
    public String getName()     { return name; }
}
