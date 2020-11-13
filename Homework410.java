package com.homework4;

import java.util.Random;

//7
//find the second largest element in an array.
public class Homework410 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int max = 0;
        int max_1 = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max_1 && array[i] != max) {
                max_1 = array[i];
            }
        }

        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("the second largest number is " + max_1);
    }
}
