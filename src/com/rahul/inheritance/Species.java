package com.rahul.inheritance;

public class Species {
    int lifeSpan;
    int maxSpeed;

    public Species(int lifeSpan, int maxSpeed) {
        this.lifeSpan = lifeSpan;
        this.maxSpeed = maxSpeed;
    }

    void details() {
        System.out.println("Species details");
    }

}
