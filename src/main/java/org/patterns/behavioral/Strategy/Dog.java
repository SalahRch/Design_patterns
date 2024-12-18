package org.patterns.behavioral.Strategy;

public class Dog extends Animal{

    public Dog(){
        super();
        setSound("WOOF WOOF");
        flyAbility = new NoFlys();
    }

    private void digAhole(){
        System.out.println("Digging a hole");
    }
}
