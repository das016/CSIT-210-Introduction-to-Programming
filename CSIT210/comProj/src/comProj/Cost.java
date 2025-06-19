package comProj;

/*
Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: LAB 3

Objective: To write a java program that prompts the user to enter the weight of an item in ounces and the
price per pound. Then ask user to enter his/her name (User can enter a string with any order of
lower/upper case characters).The name will include their first and last name with a space
between them. Note that the name will be saved in one string variable. Do not use two different
variables for first name and last name. The program will output a receipt containing the user's first and last name in all capital letters, 
the unit price, the weight in pounds, the total, and the confirmation code.

Input:
1. User's name (first & last)
2. Item's weight in ounces
3. Price per pound

Output:
\\\ Welcome DAVEED.SUMPTER ///
===============================
 Unit Price: $5.25 per pound
 Weight: 2.56 pounds
===============================
 Total: $13.44
 Confirmation Code: 32

Variables:
  - name
  - weightInOunces
  - pricePerPound

Plan:
  1. Declare & Initialize the variables ✅
  2. Obtain input from user to enter the weight of an item in ounces.✅
  3. Obtain input from the user to enter the price per pound of the item.✅
  4. Ask user to enter their name (string variable). ✅
  5. Convert weight of item in ounces to pounds (Display in receipt using DecimalFormat class).✅
  6. Generate a two-digit random number as a confirmation code (Using Random class).✅
  7. Format name (uppercase and replace space with period) ✅
  8. Print receipt (Display currency using NumberFormat class).✅
@version: 1.0 2.18.2025 */

import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Cost
{
    public static void main(String[] args) {
        
        // This declares my variables
        int weightInOunces;
        double weightInPounds;
        double pricePerPound; //This will represent the Unit Price.
        String name;
        double total;
        int confirmationCode;   //This declares my random integer variable.

        Scanner scan = new Scanner(System.in);  //This line is creating an object from the Scanner class.
        
        System.out.println("Please provide your first and last name: ");
        name = scan.nextLine(); //This stores input from the user 
        String upperCaseName = name.toUpperCase(); // Section 3.2: String Class Methods in textbook.  This makes the variable name uppercase
        String formattedName = upperCaseName.replace(" ", "."); // Section 3.2: String Class Methods in textbook. This replaces a space with a period

        System.out.println("Please enter the weight of an item in ounces using a whole number: ");
        weightInOunces = scan.nextInt();     //This obtains the user input as an integer.

        System.out.println("Please enter the item's price per pound using two decimal places: ");
        pricePerPound = scan.nextDouble();

        // Section 3.6 in Textbook: The NumberFormat Class returns an object that represents a currency format. This formats the prices to two decimal places and places a $ in front of the value.
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        //Convert ounces to pounds by dividing the number of ounces by 16.00.
        weightInPounds = (weightInOunces / 16.00);

        //Section 3.6 in Textbook: DecimalFormat class allows values to be formatted with a specific number of decimal places.
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        // This equation calculates the total cost of an item.
        total = (pricePerPound * weightInPounds);

        // Section 3.4 in Textbook: The Random Class generates a random number between specific number ranges.
        Random generator = new Random();
        confirmationCode = generator.nextInt(100); //This would print a random integer between 0 and 99.
        
        System.out.println("\\\\\\ " + "Welcome " + formattedName + " ///");
        System.out.println("==========================");
        System.out.println("Unit Price: " + numberFormat.format(pricePerPound) + " per pound"); //This line prints the price in currency format.
        System.out.println("Weight: " + decimalFormat.format(weightInPounds) + " pounds");   //This will add two decimal place values to the variable weightInPounds. 
        System.out.println("==========================");
        System.out.println("Total: " + numberFormat.format(total)); //This line prints the total in currency format.
        System.out.println("Confirmation Code: " + confirmationCode);
    }
}