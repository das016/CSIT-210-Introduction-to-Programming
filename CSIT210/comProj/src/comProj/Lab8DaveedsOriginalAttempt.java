package comProj;

import java.io.*;
import java.util.Scanner;

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
1.) Prompt user to enter a series of integer numbers (as many as they want).
2.) Save the integer numbers entered by user in an array named randomNums.
3.) Prompt user to enter one integer number.
4.) My code should count all occurrences of the user's input.
5.) Add the code to create a new integer array that has twice the number of elements as the array named randomNums.
    *The program should calculate twice the number of elements for the new array. You must not enter the numbers manually.
6.) Assign the values in randomNums to the new array.
7.) Display the new array.

*/

public class Lab8
{
    //-----------------------------------------------------------------------
    //Creates an array named randomNums that saves a series of integer numbers entered by a user.

    public static void main(String[] args) 
    {
        userNumbersList;
        //Creates a limit for the number of integer values able to be inputted by user.
        final int LIMIT = 50,000;
        int[] randomNums = new int[LIMIT];
        
        //Initialize the array values
        for (int index = 0; index < LIMIT; index++)
            randomNums[index] = index;
        
        //Invite user to enter a series of integer numbers.
        System.out.println("Welcome. Please enter a series of integer numbers. You may enter as many integer numbers as you would like: ");
        
        //Reads a list of numbers from the user and stores them in an array.
        Scanner scan = new Scanner(System.in);
        
        //Prints the size of the array using the length method.
        System.out.println("The size of the array named randomNums is: " + randomNums.length);

        //Uses a For Loop to read each number entered by the user and increments the index by 1.
        for (int index = 0; index < randomNums.length; index++)
            {
                System.out.print("Enter number " + (index + 1) + ": ");
                randomNums[index] = scan.nextInt();
            }
        

        //Print the array values
        for (int value: randomNums)
            System.out.print(value + " ");



    }
}