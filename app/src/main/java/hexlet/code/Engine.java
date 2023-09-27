package hexlet.code;

import java.util.Scanner;
public class Engine {
    private static final int MIN_GAMEDATA_LENGTH = 3;
    static void startGame(String[] bulkGameData, String userName, Scanner consoleScanner) {

        if (bulkGameData.length >= MIN_GAMEDATA_LENGTH) {             // We have at least one round

            System.out.println(bulkGameData[0]);

            for (int i = 1; i <= bulkGameData.length - 1; i += 2) {
                System.out.println("Question: " + bulkGameData[i]);
                System.out.print("Your answer: ");
                String userAnswer = consoleScanner.next();
                String correctAnswer = bulkGameData[i + 1];
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
            System.out.println("Congratulations, " + userName + "!");
            System.out.println();
        }
    }
}
