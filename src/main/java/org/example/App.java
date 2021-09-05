/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void performCalc(int temp, boolean celsius, String choice)
    {
        // Celsius true == user wants to convert from F to C
        int conversion;
        if (celsius) {
            conversion = (temp - 32)  * 5/9;
        } else {
            conversion = (temp * 9 / 5) + 32;
        }
        System.out.println("The temperature in " + choice.toUpperCase() + " is " + conversion);
    }

    public static void getUserInfo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        int temp;

        System.out.println("Press 'C' to convert from Fahrenheit to Celsius \n Press 'F' to convert"+
                "from Celsius to Fahrenheit");
        choice = reader.readLine().toLowerCase();
        System.out.println("Your Choice: " + choice.toUpperCase());
        if (choice.contains("c")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            temp = Integer.parseInt(reader.readLine());
            performCalc(temp, true, choice);
        } else {
            System.out.println("Please enter the temperature in Celsius: ");
            temp = Integer.parseInt(reader.readLine());
            performCalc(temp, false, choice);
        }
    }
    public static void main( String[] args ) throws IOException {
        getUserInfo();
    }
}
