package com.wyischina;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionDemonstration {
    public static void main(String args[]) {
        BufferedReader fileInput = null;
        try {
            FileReader file = new FileReader("C:\\test\\a.txt");
            fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++) {
                System.out.println(fileInput.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Error reading from the file");
        } finally {
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file");
                }
            }
        }
    }
}
