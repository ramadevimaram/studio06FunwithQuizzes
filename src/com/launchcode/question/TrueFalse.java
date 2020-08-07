package com.launchcode.question;

public class TrueFalse extends Base{
    public TrueFalse(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public String toString() {
        return  "\nPlease answer YES(y) or NO(n): " +
                getQuestion();
    }

    public Boolean checkingAnswer() throws Exception {
        System.out.println(getUserAnswer().toLowerCase());
        if (!"yn".contains(getUserAnswer().toLowerCase())){
            throw new Exception("Please try again. Only (y/n) allowed");
        }
        return getCorrectAnswer().equals(getUserAnswer());
    }
}
