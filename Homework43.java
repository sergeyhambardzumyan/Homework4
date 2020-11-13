package com.homework4;

import java.util.Random;
import java.util.Scanner;

//3
//find the index of an array element. if the number is not present print wrong number, please try again
public class Homework43 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        Scanner scanner = new Scanner(System.in);

        int input;
        System.out.print("Please enter the number to find it's index: ");
        input = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                System.out.println("The index of the number " + input + " is " + i);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Number does not found");
        }
    }
}
