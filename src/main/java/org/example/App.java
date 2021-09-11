/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// The program asks the user for their age and compares
// it to the legal driving age of sixteen. If the user is sixteen or older,
// then the program displays "You are old enough to legally drive."
// If the user is under sixteen, the program displays
// "You are not old enough to legally drive."

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // declare a variable to store the age
        // declare string variables to store the output strings that will be used
        // depending on the result of the comparison of the user's inputted age to
        // legal driving age
        int age;
        String s = "You are not old enough to legally drive.";
        String s2 = "You are old enough to legally drive.";

        // final string that will be outputted
        String s3;

        // prompt the user for the age
        System.out.print("What is your age? ");
        age = scanner.nextInt();

        // using ternary operator
        s3 = (age < 16) ? s : s2;

        // print the output accordingly
        System.out.print(s3);

    }

}