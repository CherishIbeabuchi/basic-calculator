package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //ask the user for the first number
        System.out.println("Enter the first number;");

        //store the answer from the user
        int firstNumber = scanner.nextInt();

        //Prompt user for the second number
        System.out.println("Enter the second number: ");

        //store the second number
        int secondNumber = scanner.nextInt();

        //Display menu header
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(Mutiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String operator = scanner.next();

        //multiply the first and second number and display the result
        int result = firstNumber * secondNumber;

        //display the result
        System.out.printf("%d * %d = %d", firstNumber, secondNumber, result);



    }
}
