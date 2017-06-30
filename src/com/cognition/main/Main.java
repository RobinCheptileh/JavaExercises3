package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/22/17.
 * <p>
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        choose();
    }

    private static void choose() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a question:" +
                "\n\t1. Write a Java program to calculate the average value of array elements." +
                "\n\t2. You are given a sequence of strings, each on a new line, until you receive “stop” command. " +
                "First string is a name of a person. On the second line you receive his email. Your task is to collect " +
                "their names and emails, and remove emails whose domain ends with 'us' or 'uk' (case insensitive)." +
                "\n\t3. By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending." +
                "\n\t4. Modify the Java code in exercise 3 to sort the array in descending order." +
                "\n\t5. Write a Java program to solve quadratic equations." +
                "\n\t6. Exit");
        int action = input.nextInt();

        switch (action) {
            case 1:
                Ex1.main(null);
                break;

            case 2:
                Ex2.main(null);
                break;

            case 3:
                Ex3.main(null);
                break;

            case 4:
                Ex4.main(null);
                break;

            case 5:
                Ex5.main(null);
                break;

            case 6:
                System.out.println("\n\tBye!");
                break;

            default:
                System.out.println("Invalid choice");
                choose();
                break;
        }
    }
}
