package comProj;

/*Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: Final Project
May 5, 2025*/

import java.util.Random;
import java.util.Scanner;

// QuizDemo is the Driver Class: contains main method.
public class QuizDemo{
    public static void main(String[] args) {
        String question;                //Each question in the quiz will be stored as a string in a variable called question.
        int questionLevelDifficulty;    //This variable stores an integer value between 1-10 to reflect the level of difficulty of each question.
        int correctAnswerIndex;     //The correct answer is the index of the string in the [] possibleAnswers array.
        String quizName;            //Each quiz has a string name appended to a three-digit random number, which is stored in the string variable called quizName.
        int threeDigitRandomNumber;  //This variable stores a three digit random number, which will be associated to each quiz. 
        String addAnotherQuestion;         //This variable stores whether the user wants to continue to add an additional question to the quiz or not.
        //int quizScore;              //This variable stores the user's quiz score for each time that the quiz is taken.
        //int correctAnswerCount;          //This variable counts and stores the total number of correct answers the user obtains on the quiz as an integer variable called correctAnswerCount.

        Scanner scanner = new Scanner(System.in); //This creates an object of the Scanner class to allow user to input information in the program.
        System.out.println("Welcome to the online quiz program where you will have the opportunity to create your own quiz questions along with 4 possible answers for each. This program will allow you to populate a quiz, present the quiz, and print the results.");
        System.out.println("Please enter a name for the quiz: ");
        quizName = scanner.nextLine();  // This creates a scanner object to obtain input from the user and stores it in the string variable called quizName.
       
        Random random = new Random();  //This creates an object of the Random class to allow me to generate a random three digit number for the Quiz name.
        threeDigitRandomNumber = random.nextInt(900) + 100;   // Reference: https://stackoverflow.com/questions/32534601/java-getting-a-random-number-from-100-to-999
        quizName = quizName + threeDigitRandomNumber;

        Quiz quizObject = new Quiz(quizName);  //Instantiates a Quiz object.
        /*Create a While Loop to obtain input from user related to the questions for the quiz.  
        I need 5 prompts in the While Loop: 
            - question
            - possibleAnswers 1-4
            - the correct answer, which is a number 1-4.
            - prompt for question difficulty, a # 1-10.
            - prompt user if they want to add another question.
        */

        while(true){
            System.out.println("Please enter a question: ");
            question = scanner.nextLine();

            String[] possibleAnswers = new String[4];      //The possible answers inputted by the user should be stored in a String array called possibleAnswers, which is made up of 4 strings.
            for(int i = 0; i < possibleAnswers.length; i++) {
                System.out.println("Please enter possible answer " + (i + 1) + ": ");
                possibleAnswers[i] = scanner.nextLine();
            }

            System.out.println("Please indicate which answer represents the correct answer by typing a number 1 through 4: ");
            correctAnswerIndex = scanner.nextInt();
            scanner.nextLine();
            correctAnswerIndex = correctAnswerIndex - 1;  //Subtracting 1 from the user's input here allows us to have the actual index of the correct answer inside the possibleAnswers array.

            System.out.println("Please enter a difficulty level for this question by typing a number 1 through 10.  1 being super easy and 10 being most difficult: ");
            questionLevelDifficulty = scanner.nextInt();
            scanner.nextLine();

            Question questionObject = new Question(question, possibleAnswers, correctAnswerIndex, questionLevelDifficulty);

            quizObject.addQuestion(questionObject);

            System.out.println();

            System.out.println("Would you like to add another question to the quiz? Please type 'Y' or 'N': ");
            addAnotherQuestion = scanner.nextLine();

            if (addAnotherQuestion.equalsIgnoreCase("N")) {
                System.out.println("All of your questions have been successfully added to the quiz.");
                break;
            }
        }

        quizObject.giveQuiz();  //This will give the quiz to the user via the giveQuiz method.

        



        //quizScore =

        
        
        /* The QuizDemo Driver Class should:
        1.) populate a quiz.
        2.) present the quiz.
        3.) print the results.
        4.) The Quiz class should contain a name which is a string quiz appending a three-digit random number. Example: "Quiz123"
        5.) Define the add method of the Quiz class to add a question to a quiz.
        6.) Define the giveQuiz method in the Quiz class.
            6a.) The giveQuiz method will present each question with four possible answers in random order.
        7.) The giveQuiz method will accept an answer for each question and keep track of the results.
        8.) Results should be presented as a percentage by calculating the formula:
            Quiz score = ceiling(points/total points) * 100
        9.) The quiz should keep an unlimited number of questions.
        10.) The quiz should have the capacity for 5 questions.
            10a.) If the current capacity has been reached, the capacity should be increased.
        11.) The driver class should be named as QuizDemo, and it should populate a quiz, present it, and print the results.
        */ 
        
    }
}