package comProj;

import java.util.Random;
import java.util.Scanner;

/*Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: Final Project
May 6, 2025*/

public class Quiz {
    private Question[] questionObjectArray = new Question[5];   // This creates an array of Question objects with the capacity for 5 questions.
    private String quizName;                                    // This is used to store a randomly generated three digit number to be appended to each quiz name.
    private int quizScore;                                      // This stores an integer value which represents each final quiz score for each user who takes the quiz.
    private double pointsEarned = 0;                                   // This stores a double value which represents the points scored on the quiz by the user.  When you divide the user's score by 100, it will return a decimal value.
    private static int questionCount;                                  // This stores the total number of questions on the quiz.  
    private int[] correctAnswerIndexesArray = new int[questionObjectArray.length];          //This stores the index of each correct answer in an object array.
    private int[] userSelectedAnswerIndexesArray = new int[5];         // This stores the selected answers by the user as an array of Strings.                               //This stores the user's selected answer as an integer.
    private int userAnswer;

    public Quiz(String quizName) {      //This is the constructor of my Quiz class.
        this.quizName = quizName;
    }

    //The following Getters will retrieve the private variables: quizName, quizScore, pointsEarned, totalPoints, questionCount.
    public String getQuizName() {
        return quizName;
    }

    public int[] getCorrectAnswerIndexes() {
        
        for (int i = 0; i < questionObjectArray.length; i++) {
            correctAnswerIndexesArray[i] = questionObjectArray[i].getCorrectAnswerIndex();
        }
        return correctAnswerIndexesArray;
    }

    public int getQuizScore() {
        return quizScore;
    }

    public double getPointsEarned() {
        return pointsEarned;
    }

    public int getQuestionCount() {
        return questionCount;
    }  

    public void addQuestion(Question questionObject) {
        //This is the addQuestion method, which adds question Objects to the questionObjectArray.
        questionObjectArray[questionCount] = questionObject;  // This stores each questionObject in the appropriate position in the questionObjectArray by subtracting 1 from the current question count value (stored in the questionCount variable) which aligns the index with the correct value.
        questionCount++;
    }

    public void giveQuiz() {
        /*This is the giveQuiz method, which will:
            1. present each question 
            2. present the four possible answers in random order.
            3. prompt user for input for each question to represent selected answer
            4. store user's selected answers in an userSelectedAnswersArray[]
            5. store quizScore value by calling calculateScore()
            6. display quizScore as percentage
        */

        System.out.println("Quiz Name: " + quizName);
        Random randomObject = new Random();    //Instantiates a randomObject of the class Random.

        //  Iterate over each Question object in the questionObjectArray using a for-each loop.
        for (int i = 0; i < questionCount; i++) {

            // 1. present each question
            System.out.println((i + 1) + ".)" + questionObjectArray[i].getQuestion());

            // Get the possibleAnswers[] for each question.
            String[] possibleAnswers = questionObjectArray[i].getPossibleAnswers();

            // 2. present each question's four possible answers in random order.
            //Shuffle the possible answer strings using Fisher-Yates: SOURCE: https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
            for (int a = possibleAnswers.length - 1; a > 0; a--) {
                // pick a random index from 0 to i (inclusive)
                int j = randomObject.nextInt(a + 1);

                // swap possibleAnswers[i] and possibleAnswers[j]
                String temp = possibleAnswers[a];
                possibleAnswers[a] = possibleAnswers[j];
                possibleAnswers[j] = temp;
            }

            // Print each randomized possible answer.
            for (String answer : possibleAnswers) {
                System.out.println(answer);
            }

            //3. prompt user for input for each question to represent selected answer
            System.out.println("Please indicate your selected answer by typing '1', '2', '3', '4': ");
            Scanner scan = new Scanner(System.in);
            userAnswer = scan.nextInt();

            //4. store each selected answer in the userSelectedAnswersArray[]
            userSelectedAnswerIndexesArray[i] = userAnswer - 1;
        }

        // 5. store quizScore value by calling calculateScore()
        quizScore = calculateScore();

        //6. display quizScore as percentage
        System.out.println("Your quiz score is: " + quizScore + "%");
    }

    public int calculateScore() {
        //This is the calculateScore method, which will present a percentage based on the number of points earned divided by the total possible points.
        for (int i = 0; i < questionCount; i++) {
            if (correctAnswerIndexesArray[i] == userSelectedAnswerIndexesArray[i]) {
                pointsEarned++;
            }
        }

        // This calculates and returns the quiz score.
        quizScore = (int) Math.round((pointsEarned / questionCount) * 100); //SOURCE: https://stackoverflow.com/questions/4540684/java-round-up-any-number#:~:text=int%20b%20%3D%20(int)%20Math.ceil(%20((double)a)%20/%20100)%3B
        return quizScore;
    }
}

