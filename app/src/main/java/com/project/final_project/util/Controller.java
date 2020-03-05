/* File: Controller.java
 * Date             Author          Changes
 * 30 Mar 16        Chris Rabe      added documentation
 */
package com.project.final_project.util;

import com.project.final_project.states.Add;
import com.project.final_project.states.AddSub;
import com.project.final_project.states.AddSubMult;
import com.project.final_project.states.AddSubMultDiv;
import com.project.final_project.states.Division;
import com.project.final_project.states.MultDiv;
import com.project.final_project.states.Multiply;
import com.project.final_project.states.State;
import com.project.final_project.states.Sub;
import com.project.final_project.states.SubMult;
import com.project.final_project.states.SubMultDiv;

/**
 * Created by chris on 30/04/2016.
 */
public class Controller {
    private static final State[] QUESTIONS = new State[]
            {new Add(), new Sub(), new AddSub(), new Multiply(),
                    new SubMult(), new Division(), new MultDiv(), new AddSubMult(),
                    new SubMultDiv(), new AddSubMultDiv()};

    private static int progress = 0;
    private static int totalCorrect = 0;
    private static int totalIncorrect = 0;
    private static int totalQuestions = 0;

    public static int difficulty = 1;

    private static State currentState = QUESTIONS[progress];
    private static Question currentQuestion = currentState.getQuestion();

    public static void resetFields() {
        progress = 0;
        totalCorrect = 0;
        totalIncorrect = 0;
        totalQuestions = 0;
    }

    public static void setDifficulty(int difficulty) {
        Controller.difficulty = difficulty;
    }

    public static int getTotalQuestions() {
        return totalQuestions;
    }

    public static String askQuestion() {
        currentQuestion = currentState.getQuestion();
        return currentQuestion.getQuestion();
    }

    public static String getCorrect() {
        return String.valueOf(totalCorrect);
    }

    public static String getTotalIncorrect() {
        return String.valueOf(totalIncorrect);
    }

    /**
     * Solves the current question being asked.
     * Algorithm implements "spaced repetition" algorithm.
     * This means that it would repeatedly ask the same questions n number of times.
     * Once the user answers the type of question n number of times, it will move on
     * to new set of questions.
     *
     * If the user answers incorrectly, the number of correctly answered decreases.
     *
     * @param solution User input
     * @return true if the user entered correct
     */
    public static boolean solve(String solution) {
        String answer = currentQuestion.getAnswer();
        if(answer == null || answer.equals("")){
            return false;
        }
        try {
            double theAnswer = Double.parseDouble(answer);
            double theSolution = Double.parseDouble(solution);
            if (theAnswer == theSolution) {
                totalCorrect++;
                totalQuestions++;
                currentState.setCorrectAnswered(currentState.getCorrectAnswered() + 1);
                // If user answered 5 correct answers, go to the next state
                if (currentState.getCorrectAnswered() == 5) {
                    currentState.setCorrectAnswered(0);
                    currentState.setIncorrectlyAnswered(0);
                    progress++;
                    if (progress == QUESTIONS.length) {
                        progress = QUESTIONS.length - 1;
                    }
                    currentState = QUESTIONS[progress];
                    currentQuestion = currentState.getQuestion();
                } else {
                    // Just generate a new question
                    currentState.setIncorrectlyAnswered(currentState.getIncorrectlyAnswered() - 1);
                    currentQuestion = currentState.getQuestion();
                }
                return true;
            } else {
                totalIncorrect++;
                totalQuestions++;
                currentState.setIncorrectlyAnswered(currentState.getIncorrectlyAnswered() + 1);
                if (currentState.getIncorrectlyAnswered() == 5) {
                    currentState.setCorrectAnswered(0);
                    currentState.setIncorrectlyAnswered(0);
                    progress--;
                    if (progress < 0) {
                        progress = 0;
                    }
                    currentState = QUESTIONS[progress];
                    currentQuestion = currentState.getQuestion();
                } else {
                    currentState.setCorrectAnswered(currentState.getCorrectAnswered() - 1);
                    currentQuestion = currentState.getQuestion();
                }
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Executes the arithmetic operation on the two digits passed
     */
    public static double getAnswer(double digit1, double digit2, char operator) {
        switch (operator) {
            case '+':
                return digit1 + digit2;
            case '-':
                return digit1 - digit2;
            case '/':
                return digit1 / digit2;
            case 'x':
                return digit1 * digit2;
        }
        return 1 + 1; //dummy return value to compile...
    }

}
