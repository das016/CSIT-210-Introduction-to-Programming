package comProj;

/**Daveed A. Sumpter [email address: su1189596@email.ccbcmd.edu]
/**
* Overview: Examine the three types of errors encountered in Java
Programs
* Input: None
* Output: Text Display * Variables: None
* Plan:
* 1. User runs the program
* 2. An error should display based on the introduced errors
*
* @version: 1.0 January 27, 2025
* @author: Daveed A. Sumpter
*/

public class Test {

	/* a. Changed Test to test
	* Prediction: The program will recognize test as a different variable. There will not be a displayed error.
	* Error type (if any): Compile-time error.
	* Error message from the compiler (if any): "class test is public, should be declared in a file named test.java" and "The public type test must be defined in its own file"
	* My interpretation of error message from the compiler: The file name "Test.java" must match the public class. In this case, the public class name is "test."  This is lower case and it must be capitalized to match the file name.  This is a compile-time Error because it occurred before the program was run.
	* 
	* b. Changed Emergency to emergency
	* Prediction: There will be no error message. The program will simply print a lower case "e" rather than a capital "E." I learned in my python class last semester, that a literal string contains quotation marks, and when you print the statement, whatever you typed inside the quotation marks will be printed on the screen. Since it is a literal string, whatever you type inside the quotation marks will print exactly as you typed it.
	* Error type (if any): None. I expected no errors.
	* Error message from the compiler (if any): None.
	* My interpretation of error message from the compiler: None.
	* 
	* c. Removed the first quotation mark in the string
	* Prediction: There will be a syntax error or a compile-time error since one of the quotation marks in the string is removed.
	* Error type (if any): Compile-time error (Syntax Error).
	* Error message from the compiler (if any): "unclosed string literal."
	* My interpretation of error message from the compiler: In order to make a string, you need to have opening and closing double quotes or single quotes.  The error message is indicating that there is no closing double quote. This is a compile-time Error because it occurred before the program was run.
	* 
	* d. Removed the last quotation mark in the string
	* Prediction: This will produce a compile-time error (Syntax Error) since one of the quotation marks in the string was removed.
	* Error type (if any): Compile-time error.
	* Error message from the compiler (if any): "String literal is not properly closed by a double-quote."
	* My interpretation of error message from the compiler: The error was caused because the string was not closed by a double quote.  It is important to ensure that strings have an opening double/single quote and a closing double/single quote to avoid errors. This is a compile-time Error because it occurred before the program was run.
	* 
	* e. change main to man
	* Prediction: This will produce a compile-time error and a logical error because you are changing an important word in the program. I do not believe the program will run due to the spelling error.
	* Error type (if any): I believe this is a Compile-time error.
	* Error message from the compiler (if any): "Main method not found in class comProj.Test, please define the main method as: public static void main(String[] args)"
	* My interpretation of error message from the compiler: The misspelling of main caused the program to not recognize the main method. This is a compile-time Error because it occurred before the program was run.
	* 
	* f. change println to bogus
	* Prediction: This change will not complete the print function. Instead, it will do the bogus function, which I do not know what it means. There will be an error because you may not need the string inside the function.
	* Error type (if any): Compile-time Error.
	* Error message from the compiler (if any): The method bogus(String) is undefined for the type PrintStream.
	* My interpretation of error message from the compiler: The cause of the error was due to the function println being changed to bogus, which means that the program will no longer print something on the screen. I am not sure what the function bogus means without using outside sources. This is a compile-time Error because it occurred before the program was run.
	* 
	* g. remove the semicolon at the end of the println statement
	* Prediction: According to Chapter 1 in the textbook, one of the rules of Java is to end a statement with a semi-colon. Based on this information, I believe if I remove the semicolon at the end of the println statement, there will be a syntax error.
	* Error type (if any): Compile-time error (syntax error).
	* Error message from the compiler (if any): ';' expected and Syntax error, insert ";" to complete BlockStatements.
	* My interpretation of error message from the compiler: At the end of a Java programming statement, you must end each statement with a semi-colon. This is a compile-time error because it occurred before the program was run. The cause of the error was that I removed the semi-colon at the end of the statement.
	* 
	* h. remove the last brace in the program
	* Prediction: I believe there will be a compile-time error because the compiler will find the syntax error before the program executes. I think it is a syntax error because if you take out the last brace in the program, you will be missing a critical punctuation character for the program to be able to compile.
	* Error type (if any): Compile-time error (syntax error)
	* Error message from the compiler (if any): reached end of file while parsing. Syntax error, insert "}" to complete ClassBody.
	* My interpretation of error message from the compiler: The compiler analyzed the program for any mistakes, and it found that the last brace in the program is essential for the program to be able to run.  Every opening parenthesis or curly brace needs a closing parenthesis or curly brace.
	
	*/
	public static void main(String[] args) {
		System.out.println("An Emergency Broadcast");

	}
}