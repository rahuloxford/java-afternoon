package com.rahul.exceptions;

import java.sql.SQLOutput;

public class New {
    public static void main(String[] args) {
        checkAge(16);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied -- you're too young");
        } else {
            System.out.println("Access granted -- welcome");
        }
    }
}
