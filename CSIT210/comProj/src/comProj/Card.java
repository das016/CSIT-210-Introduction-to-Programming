package comProj;
/*Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: LAB 6
Objective:
Write a program that ask the user to enter the number of cards that they want (n),
then it deals n cards. Your program should print the chosen cards.

Sample output:
How many cards do you want?
4
Ace of Hearts
Queen of Hearts
Ace of Diamonds
Eight of Hearts


Plan:
1.) Create 2 attributes for Card class.
2.) Suite: clubs ♣, diamonds ♦, hearts ♥ and spade
3.) A static attribute for storing the number of objects created (see the
slogan example from the textbook)
*/
import java.util.Random;

public class Card {
    private String suit;
    private String faceValue;
    private static int count = 0;  //count variable stores the number of objects created.

    public Card() {      //Constructor of my Card class.
        dealCard();  //This will set a random face value and suit.
        count++;
    }

        //The following Getters will retrieve the private variables: suit & faceValue
        public String getSuit() {
            return suit;
        } 
    
        public String getFaceValue() {
            return faceValue; 
        }
    
        //Define Setters in order to set the data in variables.
        public void setSuit(String suit) {
            this.suit = suit;
        }
        
        public void setFaceValue(String faceValue) {
            this.faceValue = faceValue;
        }

    private void dealCard() {
        Random randomValueObj = new Random();  //This creates an object of the Random Class called randomValue.
        int suitIndex = randomValueObj.nextInt(3); //The integer variable suitIndex will set one random integer value between 0 and 3, to be used in the switch statement to set the suit of the card.
        
        switch (suitIndex) {
            case 0:
                suit = "Clubs";   //A random integer value of 0 will represent the suit Clubs.
                break;
            case 1:
                suit = "Diamonds";   //A random interger value of 1 will represent the suit Diamonds.
                break;
            case 2:
                suit = "Hearts";    // A random integer value of 2 will represent the suit Hearts.
                break;
            case 3:
                suit = "Spades";    //A random integer value of 3 will represent the suit Spades.
                break;              //My program does not need a default at the end of the Switch because there are only four possible suit values.
            }

        int faceValueIndex = randomValueObj.nextInt(12);
        switch (faceValueIndex) {
            case 0:
                faceValue = "Ace";
                break;
            case 1:
                faceValue = "Two";
                break;
            case 2:
                faceValue = "Three";
                break;
            case 3:
                faceValue = "Four";
                break;
            case 4:
                faceValue = "Five";
                break;
            case 5: 
                faceValue = "Six";
                break;
            case 6: 
                faceValue = "Seven";
                break;
            case 7:
                faceValue = "Eight";
                break;
            case 8:
                faceValue = "Nine";
                break;
            case 9:
                faceValue = "Ten";
                break;
            case 10:
                faceValue = "Jack";
                break;
            case 11:
                faceValue = "Queen";
                break;
            case 12:
                faceValue = "King";
                break;
        }
    }

    //Generates an appropriate string containing the face value and suit of the card.
    @Override
    public String toString() {
        String faceValueAndSuit = this.faceValue + " of " + this.suit;
        return faceValueAndSuit;
    }

    public static int getCount() {
        return count;
    }    
}
