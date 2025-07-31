package com.rahul.inheritance;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(70, 40, 2023);
        human.details();

        Cat cat = new Cat(15, 60);
        cat.details();

        // what things you can does'nt depend on the object but
        // It depends on the type of the variable
        Species human2 = new Human(70, 40, 2020);
        human2.details();

        // not allowed common sense
//        Human human3 = new Species(50, 25);
    }
}
