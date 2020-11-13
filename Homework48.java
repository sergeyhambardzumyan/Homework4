package com.homework4;

import java.util.Random;

//5
//find the common elements between two arrays (String values).
public class Homework48 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        int[] array2 = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                if (array[i] == array2[i1]) {
                    System.out.print(array[i] + " ");
                }
            }

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
