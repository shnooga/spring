package com.shnooga.bean;

import org.springframework.stereotype.Component;

@Component("myFork")
public class Fork {
   public String getBehavior() {return "shiny";}
}
