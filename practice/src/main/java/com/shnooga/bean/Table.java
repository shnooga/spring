package com.shnooga.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Table {
    @Autowired
    private Plate roundPlate;

    public void showContent() {
        System.out.println(getClass().getSimpleName() + " has a " + roundPlate.getShape() + " " + roundPlate.getClass().getSimpleName());
        roundPlate.showContent();
    }
}
