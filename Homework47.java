package com.homework4;

import java.util.Random;

//7
//find the duplicate values of an array of integer values.
public class Homework47 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            for (int i1 = i + 1; i1 < array.length; i1++) {
                if (array[i] == array[i1]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}
