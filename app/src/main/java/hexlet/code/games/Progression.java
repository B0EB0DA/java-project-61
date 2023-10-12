package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;
import java.util.Scanner;

public final class Progression {
    private static String gameHeader = "What number is missing in the progression?";
    private static final int GAME_CYCLES = 3;
    private static final int MAX_PROGRESSION_START = 89;
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MAX_PROGRESSION_STEP = 9;

    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int progrStart = Rand.get(1, MAX_PROGRESSION_START);                                // Progression start number;
            int progrLength = Rand.get(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);         // Progression length;
            int progrStep = Rand.get(2, MAX_PROGRESSION_STEP);                                  // Progression step;
            int missingMemberIndex = Rand.get(1, progrLength - 2);                              // Progression missing member index,
                                                                                                // exclude first and last members (zero-based);
            int missingMember = progrStart + missingMemberIndex * progrStep;                    // Progression missing member value;

            String[] questionAndAnswer = new String[2];
            StringBuilder sb = new StringBuilder(String.valueOf(progrStart));
            for (int j = progrStart + progrStep; j < progrStart + progrLength * progrStep; j += progrStep) {
                if (j == missingMember) {
                    sb.append(" ..");
                } else {
                    sb.append(" ");
                    sb.append(String.valueOf(j));
                }
            }
            questionAndAnswer[0] = sb.toString();
            questionAndAnswer[1] = String.valueOf(missingMember);
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
