package org.patterns.structural.bridge;

public class Circle extends Shape{
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void checkColor() {
        System.out.println("Circle filled with :" + color.applyColor());
    }

}
