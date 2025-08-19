package com.rahul.interfaces;

public class Desktop implements Computer {

    @Override
    public String build() {
        return "Building the app using Desktop";
    }

    @Override
    public String compile() {
        return "Compiling the file using Desktop";
    }
}
