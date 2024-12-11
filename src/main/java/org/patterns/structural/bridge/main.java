package org.patterns.structural.bridge;

public class main {
    public static void main(String[] args) {
        Color green = new Green();
        Color red = new Red();
        Shape Circle = new Circle(green);
        Shape Pentagon = new Pentagon(red);

        Circle.checkColor();
        Pentagon.checkColor();
    }
}
