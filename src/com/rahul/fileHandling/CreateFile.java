package com.rahul.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File fileObj = new File("marvel.txt");

        try {
            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("A error occurred");
        }
    }
}
