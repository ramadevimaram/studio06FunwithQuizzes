package com.launchcode.question;

import java.util.ArrayList;

public class Checkbox extends Base{
    protected ArrayList<String> possibleAnswers;

    public Checkbox(String question, ArrayList<String> possibleAnswers, String correctAnswer) {
        super(question, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String toString() {
        String possibleAnswersRepr = "";
        for (int i = 0; i < this.possibleAnswers.size(); i++) {
            possibleAnswersRepr += "\n" + (i + 1) + "-" + this.possibleAnswers.get(i);
        }

        return  "\nPlease enter a stringyfied array with " +
                "the correct answers to the next question: " +
                this.getQuestion() + "\n Possible choices:" + possibleAnswersRepr;
    }
}
