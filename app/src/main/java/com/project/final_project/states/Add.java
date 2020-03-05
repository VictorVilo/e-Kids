package com.project.final_project.states;

import com.project.final_project.util.Controller;
import com.project.final_project.util.Question;
import com.project.final_project.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class Add extends AbstractState {
    @Override
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        int answer = (int) Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2, String.valueOf(answer), String.valueOf(operator));
    }

    @Override
    public char getOperator() {
        return '+';
    }
}