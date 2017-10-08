package com.shnooga.bean;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Creates a brand new bean each time; default is singleton
 */
@Scope("prototype")
@Component
public class Napkin {
    private String Color = "black";

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
