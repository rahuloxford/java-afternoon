package com.rahul.inheritance;

public class Cat extends Species {
    public Cat(int lifeSpan, int maxSpeed) {
        super(lifeSpan, maxSpeed);
    }

    @Override
    void details() {
        System.out.println("Cat lifespan: " + this.lifeSpan);
        System.out.println("Car max speed: " + this.maxSpeed);
    }
}
