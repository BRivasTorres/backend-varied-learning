package com.java.lambda;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square class : draw() mñethod");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle class : draw() method");
    }
}

public class LambdaExaple {
    public static void main(String[] args) {
        Shape renctangle = () -> {
            System.out.println("Rectangle class: draw() method");
        };

    }
}
