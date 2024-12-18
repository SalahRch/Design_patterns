package org.patterns.behavioral.Strategy;

public class main {
    public static void main(String[] args) {
        Animal doggy = new Dog();
        Animal sparky = new Bird();

        System.out.println(doggy.tryToFly());
        System.out.println(sparky.tryToFly());

        doggy.setFlyAbility(new ItFlys());
        System.out.println(doggy.tryToFly());

    }
}
