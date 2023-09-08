package com.java.lambda;

interface Shape {
    void draw();
}

// & With interface OOP */
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method");
    }
}

public class LambdaExaple {
    public static void main(String[] args) {

        // & With lambda expressions, Functional Programming
        Shape renctangle = () -> {
            System.out.println("Rectangle class: draw() method");
        };
        renctangle.draw();

        // &Utilizing parametors in a lambda expresion
        print(renctangle);

    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
