package org.patterns.structural.bridge;

public class Pentagon extends Shape{
    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void checkColor() {
        System.out.println("Pentagon filled with :" + color.applyColor());
    }
}
