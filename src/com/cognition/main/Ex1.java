package com.cognition.main;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by robin on 6/22/17.
 * <p>
 * 1. Write a Java program to calculate the average value of array elements.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] set = new int[10];
        Random rand = new Random();
        for (int i = 0; i < set.length; i++)
            set[i] = rand.nextInt(100);
        System.out.println("A randomly generated list to be used: " + Arrays.toString(set));

        int sum = 0;
        for (int i : set)
            sum += i;
        int avg = sum / set.length;

        System.out.println("Average is " + avg);
    }
}
