package comProj;

//package comProj;

//[This section of code should be in every one of your Java submissions]
 //Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
// Overview: CSIT 210: LAB 2
// Objective: The following program reads three integers and prints the average. Write a Java program to calculate the average.
//Input: None
 //Output: Text Display * Variables: None
 //Plan:
// 1. [Step 1 Ex: User runs the program]
 //2. [Step 2 Ex: Hello World and the author’s name is displayed]

//@version: 1.0 1.27.2025

import java.util.*;

public class AverageAge
{
	public static void main(String[] args) {
		int val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in) ;  //This line is creating an object from the Scanner class.

		// get three ages from the user
		System.out.println("Enter three ages and I will compute their average."); 
		System.out.print("Please enter the first age as an integer or whole number: "); 
		val1 = scan.nextInt();                   //This obtains the user input as an integer.

		System.out.print("Please enter the second age as an integer or whole number: ");
		val2 = scan.nextInt();                   //This obtains the second integer from the user.
		
		System.out.print("Please enter the third age as an integer or whole number: ");
		val3 = scan.nextInt();					//This obtains the third integer from the user.

		//Compute the average.
		average = (val1 + val2 + val3) / (3.0);      					  // This equation adds the user's three integers and divides by 3.0--------> In order to preserve the decimal places in the result, you must add at least one decimal value in the equation.
		System.out.print("The average is " + average + ".");           //  This prints the average on the screen.
	}
}


