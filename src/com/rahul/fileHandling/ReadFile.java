package com.rahul.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File fileObj = new File("marvel.txt");
            Scanner myFile = new Scanner(fileObj);
            while (myFile.hasNextLine()) {
                String line = myFile.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
