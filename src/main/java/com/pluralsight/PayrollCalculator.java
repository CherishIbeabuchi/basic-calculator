package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        //Created a Scanner object to read input
        Scanner myScanner = new Scanner(System.in);

        //Get employee name
        System.out.println("Enter employee name:");
        String name = myScanner.nextLine();

        //Get hours worked
        System.out.println("Enter hours worked:");
        double hoursWorked = myScanner.nextDouble();

        //Get pay rate
        System.out.println("Enter pay rate:");

        // Store the answer in payRate

        double payRate = myScanner.nextDouble();

        //create a variable to hold the total pay

        double totalPay = 0;

        //If statements
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * payRate;
        } else {

            // Calculate regular pay ( first 40 hours )
            double regularPay = 40 * payRate;

            //Calculate overtime hours
            double overtimeHours = hoursWorked - 40;

            //Calculate overtime pay ( 1.5x rate)
            double overtimePay = overtimeHours * payRate * 1.5;

            // Total gross pay
            totalPay = regularPay + overtimePay;
        }
           // Display result
             System.out.printf("%s's gross pay is: %.2f%n", name, totalPay);


    }
}
