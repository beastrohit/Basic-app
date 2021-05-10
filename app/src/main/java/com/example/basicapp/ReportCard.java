package com.example.basicapp;

public class ReportCard {

    String english_grade = "A";
    String maths_grade = "B";
    String hindi_grade = "A+";
    String science_grade = "C";
    String computer_grade = "A+";

    public String getEnglish_grade() {
        return english_grade;
    }

    public void setEnglish_grade(String english_grade) {
        this.english_grade = english_grade;
    }

    public String getMaths_grade() {
        return maths_grade;
    }

    public void setMaths_grade(String maths_grade) {
        this.maths_grade = maths_grade;
    }

    public String getHindi_grade() {
        return hindi_grade;
    }

    public void setHindi_grade(String hindi_grade) {
        this.hindi_grade = hindi_grade;
    }

    public String getScience_grade() {
        return science_grade;
    }

    public void setScience_grade(String science_grade) {
        this.science_grade = science_grade;
    }

    public String getComputer_grade() {
        return computer_grade;
    }

    public void setComputer_grade(String computer_grade) {
        this.computer_grade = computer_grade;
    }

    @Override
    public String toString() {
        return "english_grade= " + english_grade +
                "\n maths_grade= " + maths_grade +
                "\n hindi_grade= " + hindi_grade +
                "\n science_grade= " + science_grade +
                "\n computer_grade= " + computer_grade;
    }
}
