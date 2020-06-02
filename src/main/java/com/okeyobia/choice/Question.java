package com.okeyobia.choice;

import java.util.ArrayList;
import java.util.Collections;

public class Question {
    private String question;
    private ArrayList<String> choices;
    private String answer;

    public Question(String question, ArrayList<String> choices, String answer) {
        this.question = question;
        this.choices = new ArrayList<>();
        this.choices.addAll(choices);
        // make question change
        Collections.shuffle(this.choices);
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }
}
