package com.shnooga.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Table {
    @Autowired
    private Plate roundPlate; // matches Config's Bean name

    @Autowired
    private Fork myFork;      // matches Component's name

    public void showContent() {
        System.out.print(getClass().getSimpleName() + " has a " + roundPlate.getShape() + " " + roundPlate.getClass().getSimpleName());
        System.out.println(" with a " + myFork.getBehavior() + " " + myFork.getClass().getSimpleName());
        roundPlate.showContent();
    }
}
