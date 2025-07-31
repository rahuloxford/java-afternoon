package com.rahul.inheritance;

public class Human extends Species {
    int graduationYear;
    Human (int lifeSpan, int maxSpeed, int graduationYear) {
        super(lifeSpan, maxSpeed);
        this.graduationYear = graduationYear;
    }


    void details() {
        System.out.println("Human lifespan: " + this.lifeSpan);
        System.out.println("Human max speed: " + this.maxSpeed);
        System.out.println("Graduation year: " + this.graduationYear);
    }
}
