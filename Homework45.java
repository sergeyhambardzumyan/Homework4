package com.homework4;

import java.util.Random;

//5
//copy an array by iterating the array.
public class Homework45 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        int[] array2 = new int[20];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
