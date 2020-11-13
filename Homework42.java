package com.homework4;

import java.util.Random;

//2
//calculate the average value of array elements
public class Homework42 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        double average = (double)(sum / array.length);
        System.out.println("The average value of array elements is " + average);

    }
}
