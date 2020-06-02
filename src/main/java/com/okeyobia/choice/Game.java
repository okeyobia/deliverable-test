package com.okeyobia.choice;

import java.util.*;

public class Game {
    private final ArrayList<Question> questions;

    public Game() {
        this.questions = new ArrayList<>();
    }

    public void loadQuestionsAndAnswers() {
        String qts1 = "Where does the sun rise?";
        String qts2 = "Who invented the Telephone?";
        String qts3 = "Where is the Capital of United States?";
        ArrayList<String> choices1 = new ArrayList<>(List.of("East", "South", "West", "North"));
        ArrayList<String> choices2 = new ArrayList<>(List.of("Thomas Edison", "Micheal Faraday", "James Watt", "Alexander Bell"));
        ArrayList<String> choices3 = new ArrayList<>(List.of("Michigan", "New York", "Washington Dc", "Ohio"));
        addToQuestions(qts1, choices1, "East");
        addToQuestions(qts2, choices2, "Alexander Bell");
        addToQuestions(qts3, choices3, "Washington Dc");

    }

    private void addToQuestions(String qts, ArrayList<String> choices, String east) {
        questions.add(new Question(qts, choices, east));
        Collections.shuffle(questions, new Random());
    }

    void start() {
        Scanner scanner = new Scanner(System.in);
        int numberOfCorrect = 0;
        for (Question question: questions) {
            System.out.println(question.getQuestion());
            int numberOfChoices = question.getChoices().size();
            for (int choice = 0; choice < numberOfChoices; choice++) {
                System.out.println((choice + 1) + ": " +
                        question.getChoices().get(choice));
                
            }
            int playerAnswer = scanner.nextInt();
            ArrayList<String> choiceSet = question.getChoices();
            String correctAnswer = question.getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == correctAnswerIndex + 1) {
                numberOfCorrect++;
            }
        }
        scanner.close();
        System.out.println("You got " + numberOfCorrect + " correct answer(s).");
    }
}
