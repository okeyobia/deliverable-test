package com.okeyobia.choice;

public class Driver {

    public static void main(String[] args) {
        Game game = new Game();
        game.loadQuestionsAndAnswers();
        game.start();
    }
}
