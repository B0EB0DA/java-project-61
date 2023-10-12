package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;
import java.util.Scanner;

public final class Even {
    private static String gameHeader = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int GAME_CYCLES = 3;
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int theOperand = Rand.get();
            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = String.valueOf(theOperand);
            questionAndAnswer[1] = isEven(theOperand) ? "yes" : "no";
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
