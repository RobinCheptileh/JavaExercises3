package com.cognition.main;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by robin on 6/24/17.
 *
 * 4. Modify the Java code in exercise 3 to sort the array in descending order.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] set = new int[10];
        Random rand = new Random();
        for (int i = 0; i < set.length; i++) {
            set[i] = rand.nextInt(100);
        }

        System.out.println("A randomly generated list to be used: " + Arrays.toString(set));
        System.out.println("The new sorted array in descending order using bubble sort: " + Arrays.toString(bubbleSort(set)));
        System.out.println("The new sorted array in ascending order using brio sort: " + Arrays.toString(brioSort(set)));
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static int[] brioSort(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length; i++) {
            int max = 0, index = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            array[index] = 0;
            temp[i] = max;
        }
        return temp;
    }
}
