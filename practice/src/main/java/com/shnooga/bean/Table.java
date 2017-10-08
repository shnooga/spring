package com.shnooga.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Use @Component to signify Spring Bean
public class Table {
    @Autowired
    private Fork myFork;      // matches @Component's name

    @Autowired
    private Napkin whiteNapkin;
    @Autowired
    private Napkin blackNapkin;

    @Autowired
    private Utensil knife;    // matches @Config's Bean name
    @Autowired
    private Utensil spoon;    // matches @Config's Bean name
    @Autowired
    private Plate roundPlate; // matches @Config's Bean name

    public void showContent() {
        System.out.println(getClass().getSimpleName() + " has a " + roundPlate.getShape() + " " + roundPlate.getClass().getSimpleName());
        System.out.println(" with a " + myFork.getBehavior() + " " + myFork.getClass().getSimpleName());
        System.out.println(" with a " + knife.getBehavior() + " " + knife.getName());
        System.out.println(" with a " + spoon.getBehavior() + " " + spoon.getName());
        whiteNapkin.setColor("white");
        System.out.println(" with a " + whiteNapkin.getColor() + " " + whiteNapkin.getClass().getSimpleName());
        System.out.println(" with a " + blackNapkin.getColor() + " " + blackNapkin.getClass().getSimpleName());
        roundPlate.showContent();
    }
}
