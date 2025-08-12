package com.rahul.abstractClasses;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting..");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping..");
    }

    @Override
    public void race() {
        System.out.println("Car is racing..");
    }
}
