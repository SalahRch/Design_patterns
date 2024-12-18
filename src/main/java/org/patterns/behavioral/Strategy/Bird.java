package org.patterns.behavioral.Strategy;

public class Bird extends Animal{
    public Bird(){
        super();
        setSound("Prrrrrr Prrrrr");
        flyAbility = new ItFlys();
    }



}
