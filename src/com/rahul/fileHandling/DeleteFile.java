package com.rahul.fileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fileObj = new File("marvel.txt");

        if (fileObj.delete()) {
            System.out.println("File deleted: " + fileObj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
