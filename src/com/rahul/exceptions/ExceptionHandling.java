package com.rahul.exceptions;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
//            System.out.println(15 / 0);
            System.out.println(myNumbers[10]); // error!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed you duffer");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Application closed");
        }
    }
}
