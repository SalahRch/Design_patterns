package org.patterns.structural.bridge;

public class main {
    public static void main(String[] args) {
        Shape Circle = new Circle(new Green());
        Shape Pentagon = new Pentagon(new Red());

        Circle.checkColor();
        Pentagon.checkColor();
    }
}
