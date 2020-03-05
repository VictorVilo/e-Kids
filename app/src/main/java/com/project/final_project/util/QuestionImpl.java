package com.project.final_project.util;

/**
 * Question implementation
 */
public class QuestionImpl implements Question{
    private String question;
    private String answer;
    private String operator;

    public QuestionImpl(String question, String answer, String operator){
        this.question = question;
        this.answer = answer;
        this.operator = operator;
    }

    /** retrieves the question as a string *
     * @return the question as a string
     */
    public String getQuestion(){
        if(this.question == null){
            return "Error: No question found";
        }
        return question;
    }

    /** retrieves the answer as a string */
    public String getAnswer(){
        if(answer == null){
            return "Error: no answer found";
        }
        return answer;
    }

    public String getOperator(){
        if(operator == null){
            return "Error: no operator found";
        }
        return operator;
    }

    /** sets the question */
    public void setQuestion(String question){
        this.question = question;
    }
    /** sets the answer */
    public void setAnswer(String answer){
        this.answer = answer;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }

    /** prints the question -> answer pair */
    public String printQuestion(){
        return question + " = " + answer;
    }
}
