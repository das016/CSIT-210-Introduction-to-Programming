package comProj;

import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.random;

/*Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: LAB 8: Module 6: Arrays

Objective: Write a program that prompts the user to enter a series of integer numbers (as many
as they want) and save them in an array named randomNums. Then prompt the user
to enter ONE integer number and your code should count all the occurrences of
the user’s input.
Add the code to create a new integer array that has twice the number of elements
as randomNums and assign the values in randomNums to the new array. Display
the new array.
Note. Try to think of a way for the program to calculate twice the number of
elements for the new array, not to enter the numbers manually. 

Plan:
   To create an array: 
   Example of how to create an array:
   double[] discounts = new double[35];

Steps to follow:
✅ 1.) Prompt user to enter a series of integer numbers (as many as they want).
2.) Save the integer numbers entered by user in an array named randomNums.
3.) Prompt user to enter one integer number.
4.) My code should count all occurrences of the user's input.
5.) Add the code to create a new integer array that has twice the number of elements as the array named randomNums.
    *The program should calculate twice the number of elements for the new array. You must not enter the numbers manually.
6.) Assign the values in randomNums to the new array.
7.) Display the new array.

*/

public class Lab8 {
    int[] randomNums;        //Creates an array named randomNums that saves a series of integer numbers entered by a user.
    int[] newArrayScanner;   //Creates a new array.

    int count = 0;   //count variable stores the number of objects created.
    
    public static void main(String[] args) {

        //This instantiates an object from the Scanner class that will allow the program to receive input from the user.
        Scanner scan = new Scanner(System.in);

        //Create a sentinel value: -1      This sentinel value will stop the input from the user once they enter -1.


        //Initialize the array values
        for (int index = 0; index < randomNums.length; index++) {
            //Prompt user to enter a series of integer numbers as a string.
            System.out.println("Welcome. Please enter a series of integer numbers one-by-one. Enter -1 when finished entering numbers: " + (index + 1) + ": ");
            randomNums[index] = scan.nextInt();
        }
        
        //Prints the size of the array using the length method.
        System.out.println("The size of the array named randomNums is: " + randomNums.length);
        
        //Print the array values
        for (int value: randomNums) {
            System.out.print(value + " ");
        }


    }
}