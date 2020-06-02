package com.okeyobia;

public class Question {

    private final String prompt;
//    private final String answer;

    public Question(String prompt) {
        this.prompt = prompt;
        getMessage("Tete now");
    }

    private void getMessage(String tete_now) {
        System.out.println("Tete now");
    }

    public String getPrompt() {
        return prompt;
    }
}
