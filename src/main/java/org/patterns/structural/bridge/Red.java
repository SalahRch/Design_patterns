package org.patterns.structural.bridge;

public class Red implements Color{

    private final String description = "Red";
    @Override
    public String applyColor() {
        return description;
    }
}
