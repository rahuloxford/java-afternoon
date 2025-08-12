package com.rahul.abstractClasses;

public abstract class Vehicle {
    public abstract void start();
    public abstract void stop();

    public void race() {
        System.out.println("Vehicle is racing..");
    }
}
