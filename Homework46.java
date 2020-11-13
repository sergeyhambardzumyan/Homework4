package com.homework4;

import java.util.Random;

//6
//find the minimum value of an array.
public class Homework46 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] <= min) {
                min = array[i];
            }
        }
        System.out.print(min);
    }
}
