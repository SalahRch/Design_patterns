package org.patterns.structural.bridge;

public class Green implements Color{
    private final String description = "Green";
    @Override
    public String applyColor() {
        return description;
    }
}
