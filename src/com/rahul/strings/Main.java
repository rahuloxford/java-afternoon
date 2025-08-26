package com.rahul.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name1 = "Arihant";
        String name2 = "Arihant";

//        String name1 = new String("Arihant");
//        String name2 = new String("Arihant");
//
//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));

        StringBuilder alphabets = new StringBuilder();
        for (int i = 97; i <= 122; i++) {
            char letter = (char)i;
            alphabets.append(letter);
        }
        System.out.println(alphabets);

    }
}
