package com.rahul;

public class Func {
    public static void main(String[] args) {
        int result = total(13, 89, 25, 76, 13, 10, 19, 24, 28);
        System.out.println(result);
    }

    public static int total(int ...nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
