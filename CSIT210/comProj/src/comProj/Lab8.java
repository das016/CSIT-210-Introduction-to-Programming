package comProj;

import java.util.Arrays;
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
✅ 1.) Prompt user to enter a series of integer numbers (as many as they want).
✅2.) Save the integer numbers entered by user in an array named randomNums.
✅3.) Prompt user to enter one integer number.
✅4.) My code should count all occurrences of the user's input.
5.) Add the code to create a new integer array.
  ✅  5.b.) This new array should have twice the number of elements as the array named randomNums.
    ✅*The program should calculate twice the number of elements for the new array. You must not enter the numbers manually.
✅ 6.) Assign the values in randomNums to the new array.
7.) Display the new array.

*/

public class Lab8 {
    
    public static void main(String[] args) {

        int size;               //Tracks how big the user wants their array to be
        int[] randomNums;       //This is an array that will be used to store the numbers entered by the user
        int userSearchNumber;  //This will store the integer from the user that they are searching for
        int count = 0;          //This will be used to store how many times the number is in the array
        int[] twiceRandomNums;   //This is another array that will be used to store twice the number of elements as the array named randomNums.


        //This instantiates an object from the Scanner class that will allow the program to receive input from the user.
        Scanner scan = new Scanner(System.in);

        //This asks the user to decide how many numbers they will enter
        System.out.print("How many numbers do you want to enter? ");
        size = scan.nextInt(); //This allows the user to input the size of the array

        //This initializes an array called randomNums and sets the size equal to the input of the user
        randomNums = new int[size]; 

        //This for-loop is used to populate/fill-in the randomNums array with each number supplied by the user
        for (int index = 0; index < size; index++) {
            //Prompt user to enter a series of integer numbers as a string.
            System.out.println("Please enter a number: ");
            randomNums[index] = scan.nextInt();      //For each position in the randomNums array, starting at index 0, store the input from the user at that position in the array.
        }

        System.out.println("Please enter ONE number to count how many times it exists in the array: ");
        userSearchNumber = scan.nextInt();

        for (int arrayElement : randomNums) {        //for-each loop to iterate over each element in the array to check if it matches the number entered by the user
            if (arrayElement == userSearchNumber) {
                count++;
            }
        }

        System.out.println("There are " + count + " occurrences of the number that you inputted (" + userSearchNumber + ")");

        //Initialize new integer array called twiceRandomNums with TWICE the number of elements (program must calculate twice the # of elements as randomNums for new array).
        twiceRandomNums = new int[size * 2];
        

        //Assign (a.k.a. modify) the values in randomNums to the new array by using a traditional For Loop.
        for (int i = 0; i < size; i++) {
            // The user input at EACH POSITION in the first array must be transferred over to the Corresponding position in the new array.
            twiceRandomNums[i] = randomNums[i];
        }


        //Display the NEW array
        System.out.println(Arrays.toString(twiceRandomNums));
    }
}