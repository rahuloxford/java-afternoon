package com.rahul.finalKeyword;

import java.util.Arrays;

public class Main {
    public final static String name = "Tim olsen";
    public static void main(String[] args) {
        final float pi = 3.1415F;
        System.out.println(pi);
//        pi = 3.9537F; // java: cannot assign a value to final variable pi
//        System.out.println(pi);
        System.out.println(name);

        final int arr[] = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        arr[0] = 101;

//        arr = new int[5];
        System.out.println(Arrays.toString(arr));

    }
}
