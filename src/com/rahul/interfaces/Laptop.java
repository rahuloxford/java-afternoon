package com.rahul.interfaces;

public class Laptop implements Computer {

    @Override
    public String build() {
        return "Building the app using Laptop";
    }

    @Override
    public String compile() {
        return "Compiling the file using Laptop";
    }

}
