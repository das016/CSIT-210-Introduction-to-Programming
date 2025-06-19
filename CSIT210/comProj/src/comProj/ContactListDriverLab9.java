package comProj;

/* Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
* Overview: CSIT 210: LAB 9 Contact List

*Objective: In this assignment you are going to create a contact list. Write a Java application
that reads arbitrary number of names and their zip codes for individuals. Store the
data in a Contact object. 

*Plan: 

*Steps to follow/Program Requirements:
1.) Must read an arbitrary number of names for individuals inputted by user.
2.) Store input data in a contact object.
3.) Must read an arbitrary number of zip codes for individuals inputted by user.
4.) Store input data in a contact object.
5.) The contact class must have 3 attributes:
    5a.) to store a first name (string).
    5b.) to store a last name (string).
    5c.) to store a zip code (integer).
6.) In driver class, user must enter an arbitrary number of contacts.
    6a.) Each contact must have: First name, Last name, zip code.
7.) Read the input from user and store it in a variable.
8.) Let user search for a contact by entering their last name.
9.) If the name is NOT on the list, the program should print: 
"Not found".
10.) If the name is on the list, the program should print: 
    10a.) the first name of the given person.
    10b.) the last name of the given person.
    10c.) the zip code of the given person.
11.) The code should NOT ask user how many contacts they want to enter.
12.) Let user continue entering input as long as they want.
    12a.) Must ask user if they want to continue.
13.) DO NOT USE ArrayList!
14.) USE a regular array to store the contacts.
 * 
 */

import java.util.Scanner;

public class ContactListDriverLab9 {

    public static void main(String[] args) {
    
        //How much data can be stored.
        int size = 10000;
        Contact[] contactArray = new Contact[size];
        int contactCount = 0;
        boolean keepPlaying = true;
        String firstName;
        String lastName;
        int zip;
        String continueAddingContacts; //This will indicate whether the user wants to continue adding contacts to their list.
        String personSearched;  //This will store the value representing the person who the user is attempting to search for.

        Scanner scanner = new Scanner(System.in);

        //Main method reads each contact inputted by the user until the user says there are no more contacts to input.
        while(keepPlaying) {
            System.out.println("Please enter the first name of the contact who you would like to add to the contact list: ");
            firstName = scanner.next();
            System.out.println("Please enter the last name of the contact who you would like to add to the contact list: ");
            lastName = scanner.next();
            System.out.println("Please enter the ZIP code of the contact: ");
            zip = scanner.nextInt();
            
            Contact newContact = new Contact(firstName, lastName, zip);  //This creates a new Contact object

            //Add the new Contact object to the Contact [] contactArray.
            contactArray[contactCount] = newContact;
            contactCount++;

            System.out.println("Would you like to continue to add another contact? (Y/N): ");
            continueAddingContacts = scanner.next();

            if(continueAddingContacts.equalsIgnoreCase("N")) {
                keepPlaying = false;
                System.out.println("Thank you for adding contacts to the contact list.  Your contact list is complete.");
            }
        }
        
        //Prompt user to search for a contact by entering a contact's last name.
        System.out.println("Please enter the last name of the person/contact you are searching for: ");
        personSearched = scanner.next();

        //Use a for-each loop to process the data in the array.
        for (Contact contact: contactArray) {
            if(contact != null && contact.getLastName().equalsIgnoreCase(personSearched)) {
                System.out.println("You have found the person you are looking for " + contact);  //This line calls the Contact toString() method which returns the string representation of each matched Contact object.
            }
        }
    }
}
