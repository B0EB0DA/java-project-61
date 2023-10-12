package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;
import java.util.Scanner;

public final class GCD {
    private static String gameHeader = "Find the greatest common divisor of given numbers.";
    private static final int GAME_CYCLES = 3;
    public static int getGCD(int firstOperand, int secondOperand) {
        while (true) {
            if (firstOperand > secondOperand) {
                firstOperand = firstOperand % secondOperand;
                if (firstOperand == 0) {
                    return secondOperand;
                }
            } else {
                secondOperand = secondOperand % firstOperand;
                if (secondOperand == 0) {
                    return firstOperand;
                }
            }
        }
    }
    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int firstOperand = Rand.get();
            int secondOperand = Rand.get();
            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = String.valueOf(firstOperand) + " " + String.valueOf(secondOperand);
            questionAndAnswer[1] = String.valueOf(getGCD(firstOperand, secondOperand));
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
