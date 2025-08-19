package com.rahul.interfaces;

public class Coder {
    public static void main(String[] args) {
        Computer computer = new Desktop();

        System.out.println(computer.build());
        System.out.println(computer.compile());
        
    }
}
