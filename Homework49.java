package com.homework4;

import java.util.Random;

//6
//remove duplicate elements from an array.
public class Homework49 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    int index = -1;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = i + 1; i1 < array.length; i1++) {
                if (array[i] == array[i1]) {
                    index = i1;
                    break;
                }
            }
        }
        int[] array2 = new int[19];
        if(index != -1) {


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
