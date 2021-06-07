/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 9 - Paint Calculator
 *  Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
 *
 *  Constraint:
 *  Use a constant to hold the conversion rate.
 *  Ensure that you round up to the next whole number.
 */

package ex09;
import java.util.Scanner;

public class base {
    // Constant initialization
    public static int gallonCoverage = 350;

    public static void main(String [] args)
    {
        // Variable Initialization
        Scanner userInput = new Scanner(System.in);
        int length, width;
        double feet, gallons;

        // User Input Step
        System.out.printf("What is the length of the room? ");
        length = userInput.nextInt();

        System.out.printf("What is the width of the room? ");
        width = userInput.nextInt();

        // Calculations
        feet = length * width;
        // Round up
        gallons = Math.ceil(feet / (double)gallonCoverage);

        // Output
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallons,feet);
    }
}
