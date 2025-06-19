package comProj;
import java.util.Scanner;

/* Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
* Overview: CSIT 210: LAB 10: Exception Class: StringTooLongException

*Objective: Design and implement a program that creates an exception class called
StringTooLongException, designed to be thrown when a string is discovered
that has too many characters in it. In the main driver of the program, read
strings from the user until the user enters "DONE". If a string that has too
many characters (say 20) is entered, throw the exception. Allow the thrown
exception to terminate the program.

Plan:

Steps to follow:
1.) Design a program that creates an exception class called StringTooLongException.
2.) The exception must be thrown when a string is discovered that has too many characters in it.
3.) In the main driver of the program, read strings from the user until the user enters "DONE".
4.) If a string that has too many characters (say 20) is entered, throw the exception.
5.) Allow the thrown exception to terminate the program.
*/

public class StringTooLongExceptionDriver {

    private static class StringTooLongException extends StringIndexOutOfBoundsException {

        public StringTooLongException(String message) {
            super(message);
        }
    }
    
    //Creates an exception object and possibly throws it.

    public static void main(String[] args) throws StringTooLongException {
        boolean keepGoing = true;
        final int MAX = 20;     //20 is the maximum number of characters allowed for an input string by the user.
        String userInput;            //The input from the user will be stored in an integer variable called userInput.
        int characterCount = 0;      //The characters of the string inputted by the user will be counted and stored in the character variable called count.

        Scanner scan = new Scanner(System.in); //This instantiates an object from the Scanner class that will allow the program to receive input from the user.
        
        System.out.println("Welcome. This program is designed to detect when user input has too many characters in it. If you enter a string that has 20 or more characters in it, an error message will appear and the program will be terminated.");

        while(keepGoing){
            System.out.println("Please enter a message that is 20 characters or less. Otherwise, please type the word 'DONE' to end the program: ");
            userInput = scan.nextLine(); //This will read the input from the user as an integer and store it in the variable called userInput.
            characterCount = userInput.length();
            
            // This will test to see if the message is valid
            if(characterCount > MAX) {  //This will determine if the exception should be thrown.
                throw new StringTooLongException("ERROR: Improper user input length. You have exceeded the maximum limit of the possible number of characters inputted, which is 20. You have inputted " + characterCount + " characters." + "  Input value is out of range. Please enter a shorter string to continue.");
            }
            
            if (userInput.equalsIgnoreCase("DONE")) {
                keepGoing = false;  //This statement is not necessary since the break statement follows it.  If the break statement did not follow, keepGoing = false would be absolutely necessary to exit the while loop.
                break; // This exits the loop when the user types "done" or "DONE"
            }

            System.out.println("Congratulations! The message that you have entered is valid. It contains 20 characters or less.");
        }

    }
}
