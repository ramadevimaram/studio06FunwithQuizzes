package com.launchcode.quiz;

import com.launchcode.question.Base;

import java.util.ArrayList;

public class Quiz {
    public ArrayList<Base> questions;

    public Quiz(ArrayList<Base> questions) {
        this.questions = questions;
    }

    public void addQuestion(Base aQuestion){
        questions.add(aQuestion);
    }

    public Double gradeQuiz() throws Exception {
        Double totalSum = 0.0;
        for (Base aQuestion : this.questions) {
            System.out.println("User ANswer: " + aQuestion.getUserAnswer());
            System.out.println("Correct ANswer: " + aQuestion.getCorrectAnswer());
            System.out.println("Comparison: " + (aQuestion.checkingAnswer() == true));

            if (aQuestion.getUserAnswer() == null) {
                System.out.println(aQuestion.getQuestion());
                throw new Exception("User has not answered all questions. Please do so.");
            } else if (aQuestion.checkingAnswer() == true){
                totalSum += 1;
            }
            System.out.println(totalSum);
        }
        return totalSum/this.questions.size();
    }
}