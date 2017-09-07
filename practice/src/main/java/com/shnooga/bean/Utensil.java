package com.shnooga.bean;

import org.springframework.stereotype.Component;

@Component // Use @Component to signify Spring Bean
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
