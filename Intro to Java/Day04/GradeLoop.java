package javaapplication3;

import java.util.Scanner;

public class JavaApplication94 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] characters = new char[20];
        System.out.println("Please enter at least 20 characters:");
        for (int i=0; i<20; ++i) {
            char c = (char)scanner.next().charAt(0);
            characters[i] = c;
        }
        
        for (int i=0; i<20; ++i) {
            System.out.println(characters[i]);
        }
    }
    
}
