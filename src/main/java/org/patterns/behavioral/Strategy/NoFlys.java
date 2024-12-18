package org.patterns.behavioral.Strategy;

public class NoFlys implements Flys{
    @Override
    public String Fly() {
        return "Cannot fly";
    }

    @Override
    public String Dive() {
        return "Cannot dive";
    }
}
