package com.rahul.arraylists;

import java.util.ArrayList;

public class AboutArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(5);
        numbers.add(45);
        numbers.add(60);
        numbers.add(50);
        numbers.add(0, 40);

        System.out.println("Numbers size: " + numbers.size());
//        System.out.println(numbers.get(1));
        numbers.set(1, 101);
        numbers.remove(2);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}