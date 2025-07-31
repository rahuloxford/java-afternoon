package com.rahul.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWrite = new FileWriter("marvel.txt");
            fileWrite.write("I am Tony Stark\n");
            fileWrite.write("I am Steve Rogers\n");
            fileWrite.write("I am Groot");
            fileWrite.close();
            System.out.println("Successfully written into file");
        } catch (IOException e) {
            System.out.println("A error occurred");
        }
    }
}
