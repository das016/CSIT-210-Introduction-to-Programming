package comProj;

/*Daveed A. Sumpter [su1189596@email.ccbcmd.edu]
Overview: CSIT 210: Final Project
May 3, 2025

Objective: When instructors want to create an online quiz, they first create a quiz and give it a name. After the
creation of the quiz, they will have an empty quiz with no questions. Later, they add the questions one
by one. This project will require you to build a quiz with “add question” functionality. So, you will have a
Quiz class and a Question class.

Plan:
1.) The Question class should have 5 strings representing the question and 4 possible answers.
2.) The Question class should have an integer in the range of 1-4, representing the correct answer.
3.) The possible answers should be stored in an array of 4 strings.
4.) The correct answer is the index of the string in the array.
5.) Each question should have a level of difficulty, a number between 1-10. (The number 1 reflects a very easy question and the number 10 reflects a very difficult question).
*/

public class Question {
    private String question;                 // The question variable stores each inputted question by the user in the quiz as a string. 
    private int correctAnswerIndex;          // The correctAnswerIndex variable stores the index of the correct answer to each question as an integer value.
    private String[] possibleAnswersArray = new String[4];  // The possible answers should be stored in an array of 4 strings.
    private int questionLevelDifficulty;     //The questionLevelDifficulty variable stores a number between 1 and 10 as an integer to reflect the level of difficulty of each question.
    private int userSelectedAnswer;         // Used to store the user's selected answer for each question.
    
    public Question(String question, String[] possibleAnswersArray, int correctAnswerIndex, int questionLevelDifficulty) {     // Constructor of my Question Class.
        //dealQuestion();      // The dealQuestion method will set a random question.
        this.question = question; 
        this.possibleAnswersArray = possibleAnswersArray;
        this.correctAnswerIndex = correctAnswerIndex;
        this.questionLevelDifficulty = questionLevelDifficulty;
    }

    // The following Getters will retrieve the private variables: question, possibleAnswers, correctAnswer, questionLevelDifficulty.
    public String getQuestion() {
        return question;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswersArray;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
    
    public int getQuestionLevelDifficulty() {
        return questionLevelDifficulty;
    }

    // Define Setters in order to set the data in variables.
    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }
    
    public void setPossibleAnswers(String[] possibleAnswersArray) {
        this.possibleAnswersArray = possibleAnswersArray;
    }

    public void setQuestionLevelDifficulty(int questionLevelDifficulty) {
        this.questionLevelDifficulty = questionLevelDifficulty;
    }
}


