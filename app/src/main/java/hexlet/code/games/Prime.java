package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public final class Prime {
    private static String gameHeader = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int GAME_CYCLES = 3;
    private static final int MIN_VALUE = 10;
    private static final int MAX_VALUE = 999;
    private static final int PRIME_3 = 3;

    public static boolean isPrime(int n) {
        if (n % 2 == 0 || n < 2) {
            return false;
        }
        for (int i = PRIME_3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int theOperand = Utils.getRandom(MIN_VALUE, MAX_VALUE);
            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = String.valueOf(theOperand);
            questionAndAnswer[1] = isPrime(theOperand) ? "yes" : "no";
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
