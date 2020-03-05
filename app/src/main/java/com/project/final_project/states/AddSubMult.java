package com.project.final_project.states;

import com.project.final_project.util.Controller;
import com.project.final_project.util.Question;
import com.project.final_project.util.QuestionImpl;

/**
 * Created by dean on 30/04/16.
 */
public class AddSubMult extends AbstractState {
    public Question getQuestion() {
        int digit1 = (int) generateRandomNumber();
        int digit2 = (int) generateRandomNumber();
        char operator = getOperator();
        //Switch digits around so don't get integers
        if(digit1 < digit2 && operator == '-'){
            int temp = digit1;
            digit1 = digit2;
            digit2 = temp;
        }
        int answer = (int) Controller.getAnswer(digit1, digit2, operator);
        return new QuestionImpl("" + digit1 + operator + digit2, String.valueOf(answer), String.valueOf(operator));
    }

    @Override
    public char getOperator() {
        int val = (int) Math.random() * 3;
        switch (val) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return 'x';

        }
        return ' ';
    }
}
