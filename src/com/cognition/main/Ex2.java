package com.cognition.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by robin on 6/24/17.
 * <p>
 * 2. You are given a sequence of strings, each on a new line, until you receive “stop” command. First string is a
 * name of a person. On the second line you receive his email. Your task is to collect their names and emails, and
 * remove emails whose domain ends with "us" or "uk" (case insensitive).
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Details> details = new ArrayList<>();
        String name, email;
        while (true) {
            System.out.println("Enter name");
            name = input.nextLine();
            if (name.equalsIgnoreCase("stop"))
                break;
            else {
                System.out.println("Enter email");
                email = input.nextLine();
                if (email.equalsIgnoreCase("stop"))
                    break;
                else {
                    if (!email.substring(email.length() - 2).equalsIgnoreCase("us") && !email.substring(email.length() - 2).equalsIgnoreCase("uk"))
                        details.add(new Details(name, email));
                }
            }
        }

        for (Details d : details)
            System.out.println(d.name + " -> " + d.email);
    }
}

class Details {
    String name;
    String email;

    Details(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
