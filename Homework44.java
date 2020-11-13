package com.homework4;

import java.util.Random;
import java.util.Scanner;

//4
//remove a specific element from an array. if the number is not present print wrong number, please try again
public class Homework44 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.print("Please enter the number to remove from an array: ");
        input = scanner.nextInt();

        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                index = i;
                count++;
            }
        }

        if(count != 0) {
            int[] array2 = new int[19];

            for (int i = 0; i < index; i++) {
                array2[i] = array[i];
            }
            for (int i = index; i < 20; i++) {
                if (i + 1 < 20) {
                    array2[i] = array[i + 1];
                }
            }

            //print
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        }
    }
}
