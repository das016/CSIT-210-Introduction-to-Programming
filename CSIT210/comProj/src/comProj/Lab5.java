package comProj;

import java.io.*;
import java.util.Scanner;

/*Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: LAB 5

Objective: Design and implement a program to read from an input file that contains text and
numbers then counts the number of integer values in the file.
Produce a table listing the values you identify as integers from the input file.
Your program should work with any text file without generating a run-time error

Input: 
1.) input.txt

//Plan:
1. Read data from input file
2. Count the number of integer values in the file.
3. Produce a table listing the integer values from input file. */


public class Lab5 
{
    public static void main (String[] args) 
    throws IOException
    {
        //Declare Variables
        int counter = 0;  
        int number = 0; 
        //Read data from input file
        Scanner scan = new Scanner(new File("input.txt"));

        
        System.out.println("Integers found: ");


        //To read and process each line of the file
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                number = scan.nextInt();  //This reads the integer values.

                System.out.print(number + "\t");

                /*if ((counter + 1) % 5 == 0) { // New line after every 5 numbers
                    System.out.println();
                }*/

                counter++;  // This counter variable counts the number of integers found in the text file.
                
            } else {
                scan.next();  //If an integer is not found, this method will skip to the next piece of data in the file.
            }
        }

        System.out.println();
        System.out.println("Total number of integers found in textfile: " + counter);
    }
}