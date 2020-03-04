package com.project.final_project;

public class Numbers {
    private String digit, number;

    public Numbers() {
    }

    public Numbers(String digit, String number) {
        this.digit = digit;
        this.number = number;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}