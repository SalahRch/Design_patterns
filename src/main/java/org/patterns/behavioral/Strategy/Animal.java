package org.patterns.behavioral.Strategy;

public class Animal {
    private String name;
    private String favFood;
    private double weight;
    private double height;
    private String sound;
    public Flys flyAbility;

    public Animal(){

    }


    public String tryToFly() {
        return flyAbility.Fly();
    }

    public void setFlyAbility(Flys flyAbility) {
        this.flyAbility = flyAbility;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
