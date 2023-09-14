package com.complete.java;

public class Abstract {
    public abstract class Vehicle {
        abstract void go();
    }

    public class Car extends Vehicle {
        @Override
        void go() {
            System.out.println("The driver is drivint the car");
        }
    }

    // Vehicle vehicle = new Vehicle();
    Car car = new Car();
}
