package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(String gameHeader, String[][] gameData, Scanner consoleScanner) {

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = consoleScanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameHeader);

        for (String[] questionAndAnswer : gameData) {
            if (questionAndAnswer.length == 2) {
                String gameQuestion = questionAndAnswer[0];
                String correctAnswer = questionAndAnswer[1];
                System.out.println("Question: " + gameQuestion);
                System.out.print("Your answer: ");
                String userAnswer = consoleScanner.next();
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
