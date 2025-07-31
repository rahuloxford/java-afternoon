package com.rahul.fileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File fileObj = new File("marvel.txt");

        if (fileObj.exists()) {
            System.out.println("File name: " + fileObj.getName());
            System.out.println("File location: " + fileObj.getAbsolutePath());
            System.out.println("Writeable: " + fileObj.canWrite());
            System.out.println("Readable: " + fileObj.canRead());
            System.out.println("File size in byte: " + fileObj.length());
        } else {
            System.out.println("File does not exists");
        }
    }
}
