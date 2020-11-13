package com.homework4;

import java.util.Random;

//8
//Create an array with length 10
//Initialize with random ints (10 - 99)
//print it
//sort it in asc order
//print the sorted
public class Homework411 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        //Initialize
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }
        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //sort
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = i + 1; i1 < array.length; i1++) {
                if (array[i] > array[i1]) {
                    temp = array[i];
                    array[i] = array[i1];
                    array[i1] = temp;
                }
            }
        }
        System.out.println();
        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
