package comProj;

import java.util.Scanner;

/*
Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: LAB 4

Objective: Write a java program that asks the user to enter a 4-digit number and a math
operator (addition, subtraction, multiplication, or division). Evaluate the number of
digits, if the user’s input has more or less than 4 digits, print an error message and
do not continue the execution.
If the input is valid, your program should separate the user’s input number to two
2-digit numbers.

Input: 
1.) User must enter a 4-digit number.
2.) User must enter a math operator (+, -, *, /)


Output: 

Enter a 4-digit number:
2134
Enter an operator:
-
Input number: 2134
Number 1: 21
Number 2: 34
Result: 21-34 = -13

Variables:
-numberEntered
-num1
-num2
-operator
-result
-numberOfDigits

Conditions:
num1 > 0
if operator = /, num2 > 0.
if operator = /, and num 2 = 0, print a message that the operator is invalid for the given input.

Plan: 
✔️ 1. Declare (and sometimes initialize) the variables.
✔️2. Obtain input from user to enter a 4-digit number.
✔️3. Obtain input from user to enter a math operator (+, -, *, /).
✔️4. Evaluate the number of digits:
     ✔️ If user's input > 4 digits, print an error message and do not execute.
     ✔️ If user's input < 4 digits, print an error message and do not execute.
✔️ 5. If input is valid, the program must separate the user's input number to two 2-digit numbers.
   Example: If input = 2134, then num1 = 21 and num2 = 34
✔️6. After separation, apply the operator that the user entered and save result in a variable.
✔️7. num1 cannot be zero.
✔️8. Ensure that if the operator is division, then num2 is not zero (prevent dividing by zero).
✔️9. If num 2 is zero and the operator is division, the program should print a message that the operator is invalid for the given input.
✔️10. The output should include num1, num2, and result in form of an equation.
 * 
 */

public class Lab4 {
 
    public static void main(String[] args) {

        //This declares my variables
        String fourDigitNumber;       // This variable will store an Integer object representing the four-digit number from the user.
        int firstTwoDigits;          //This variable will store the first two digits of the four digit integer inputted by user.   
        int lastTwoDigits;           //This variable will store the last two digits of the integer entered by the user.
        String mathOperator;         //This variable will store the math operator chosen by the user.
        int numberOfDigits;      //This variable will store an Integer object representing the number of digits within a string inputted by the user.
        int fourDigitInteger;        // This variable will store the integer value that represents the four digit string inputted by the user.
        int total = 0;
        

        Scanner scan = new Scanner(System.in);   //This creates an object from the Scanner class.

        System.out.println("Please enter a 4-digit number: ");  //Prompts user to enter a 4-digit number.
        fourDigitNumber = scan.nextLine(); //Stores input from the user. 

        //  Use the length() String method to count the number of characters in the user's input and store this value in the numberOfDigits variable. 
        //This is needed in order to evaluate whether or not the user inputted the minimum number of digits required.  The numberOfDigits variable is an integer because the length() String method returns an int value.
        numberOfDigits = fourDigitNumber.length();

        // This checks if the user supplied the correct number of digits. If the numberOfDigits variable is greater than 4, then it will print the error message and then it will terminate/exit the program. Source: https://stackoverflow.com/questions/22452930/terminating-a-java-program
        if (numberOfDigits > 4){
            System.out.println("Error...Too many digits entered. Please enter a four digit number.");
            System.exit(0);          //To exit a program, use System.exit(0);
        }
    
        // This checks if the user supplied the correct number of digits. If the numberOfDigits variable is less than 4, then it will print the error message and then it will terminate/exit the program..
        if (numberOfDigits < 4){
            System.out.println("Error...Not enough digits entered. Please enter a four digit number.");
            System.exit(0);          //To exit a program, use System.exit(0);
        } 

        System.out.println("Please enter a math operator (+, -, *, /): "); //Prompts user to enter a math operator.
        mathOperator = scan.nextLine();   //This stores input from the user.

        //Task: To convert the String variable fourDigitNumber into an integer value to be able to perform math operations to split the number in half.
        fourDigitInteger = Integer.parseInt(fourDigitNumber);   
        firstTwoDigits = fourDigitInteger / 100;  //This obtains the first two digits of the four digit integer and divides it by 100.  Source: https://stackoverflow.com/questions/11900147/split-4-digit-integer-in-java
        lastTwoDigits = fourDigitInteger % 100;   //This obtains the last two digits of the four digit number by finding the remainder of the number when it is divided by 100. Source: https://stackoverflow.com/questions/11900147/split-4-digit-integer-in-java
        
        if (firstTwoDigits == 0){
            System.out.println("The input is invalid. The first two digits cannot be equal to zero. Please enter another four digit number.");
            System.exit(0);       //To exit a program, use System.exit(0).
        }

        // After separation, apply the operator that the user entered and save result in a variable.
        switch (mathOperator)
         {
            case "+":
                 total = firstTwoDigits + lastTwoDigits;
                break;
            case "-":
                total = firstTwoDigits - lastTwoDigits;
                break;
            case "*": 
                total = firstTwoDigits * lastTwoDigits;
                break;
            case "/":
                if (lastTwoDigits == 0){
                    System.out.println("The last two digits cannot be equal to zero...Please enter a different number.");
                    System.exit(0);
                }
                total = firstTwoDigits / lastTwoDigits;
                break;
            default:
                System.out.println("Error: Please enter the correct math operator: +, -, *, /");
                
         }

        System.out.println("////// Output \\\\\\\\\\\\");
        System.out.println("Input number: " + fourDigitNumber);
        System.out.println("Number 1: " + firstTwoDigits);
        System.out.println("Number 2: " + lastTwoDigits);
        System.out.println("Result: " + firstTwoDigits + mathOperator + lastTwoDigits + "=" + total);
    }
}
