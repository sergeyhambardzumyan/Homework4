package com.homework4;

//1.
//sum values of an array.
import java.util.Random;

public class Homework41 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //sum values of an array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of the values in the array is " + sum);
    }
}
