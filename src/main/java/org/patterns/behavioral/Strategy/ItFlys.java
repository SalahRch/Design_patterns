package org.patterns.behavioral.Strategy;

public class ItFlys implements Flys{
    @Override
    public String Fly() {
        return "Flying high";
    }

    @Override
    public String Dive() {
        return "Diving deep";
    }
}
