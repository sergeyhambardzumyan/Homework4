package com.homework4;

import java.util.Scanner;

//9
//Check if string is Palindrome;
public class Homework412 {
    public static void main(String[] args) {
        String name = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        name = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < (name.length() - 1) / 2 ; i++) {
            if(name.charAt(i) == name.charAt(name.length() - i - 1)) {
                count++;
            }
        }
        if ( count == (name.length() - 1) / 2) {
            System.out.println("The string is Palindrome!");
        } else {
            System.out.println("The string is not Palindrome!");
        }

    }
}
