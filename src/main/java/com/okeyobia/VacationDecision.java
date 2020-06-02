package com.okeyobia;

import java.util.Scanner;

import static com.okeyobia.VacationType.*;
import static com.okeyobia.VacationType.musical;

public class VacationDecision {


    public static void main(String[] args) {

        String q1 = "What kind of trip would you like to go on?\n " +
                "(a) musical\n (b) tropical\n (c) adventurous\n";
        String q2 = "How many are in your group?";

        Question[] questions = {
                new Question(q1),
                new Question(q2)
        };
        takeTest(questions);


    }

    public static void takeTest(Question[] questions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(questions[0].getPrompt());
        String vacationType = scanner.next();
        String vacation = getVacation(vacationType);
        String destination = getDestination(vacation);
        System.out.println(questions[1].getPrompt());
        int groupSize = scanner.nextInt();
        String travelSuggestion;
        travelSuggestion = getTravelSuggestion(groupSize);
        System.out.println("Since you’re a group of " +groupSize +" going on a " + vacation + " vacation, you\n" +
                "should take a " + travelSuggestion + " to " + destination);
        scanner.close();
    }

    private static String getDestination(String vacation) {
        return switch (vacation) {
            case "musical"-> "New Orleans";
            case "tropical" -> "Beach Vacation in Mexico";
            case "adventurous"  -> "Whitewater Rafting the Grand Canyon";
            default -> " Please enter ";
        };
    }

    private static String getTravelSuggestion(int groupSize) {
        return switch (groupSize) {
            case 1, 2 -> "First Class";
            case 3, 4, 5 -> "Helicopter";
            case  6 -> "Charter Flight";
            default -> "Charter Flight";
        };
    }

    private static String getVacation(String vacationType) {
        return switch (vacationType) {
            case "a"-> "musical";
            case "b" -> "tropical";
            case "c"  -> "adventurous";
            default -> throw new IllegalStateException("Unexpected value: " + vacationType);
        };
    }


}


 enum VacationType {
    musical, Tropical, Adventurous
}
