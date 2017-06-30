package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/24/17.
 * <p>
 * 5. Write a Java program to solve quadratic equations.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, x1, x2;
        System.out.println("Quadratic equation: ax² + bx + c = 0\n");
        System.out.println("Enter value of a");
        a = input.nextInt();
        System.out.println("Enter value of b");
        b = input.nextInt();
        System.out.println("Enter value of c");
        c = input.nextInt();

        System.out.println("\nEquation: " + a + "x² + " + b + "x + " + c + " = 0\n");

        d = ((int) Math.pow(b, 2) - (4 * (a * c)));

        if (d >= 0) {
            x1 = (-b + (int) Math.sqrt((double) d)) / (2 * a);
            x2 = (-b - (int) Math.sqrt((double) d)) / (2 * a);

            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else {
            System.out.println("This equation has no real roots");
        }
    }
}
