package comProj;

import java.util.Scanner;

//Driver class
public class PlayCards{
    public static void main(String[] args) {
        int numberOfCards;
        String cardDealt;
        Scanner scanner = new Scanner(System.in); //This creates an object of the Scanner Class to allow user to input information in program.

        System.out.println("Please enter the number of cards you would like?");
        numberOfCards = scanner.nextInt();  //This stores the user input as an integer value in the numberOfCards variable.

        for (int x = 0; x < numberOfCards; x++) {
            Card card = new Card(); //A Card object with a name of card is created with a random suit and face value set.
            cardDealt = card.toString();
            System.out.println(cardDealt);
        }
    }
}