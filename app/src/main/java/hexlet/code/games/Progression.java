package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public final class Progression {
    private static String gameHeader = "What number is missing in the progression?";
    private static final int GAME_CYCLES = 3;
    private static final int MAX_PROGRESSION_START = 89;
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MAX_PROGRESSION_STEP = 9;

    private static int[] generateProgressionArray(int progrStart, int progrLength, int progrStep) {
        int[] ret = new int[progrLength];
        for (int i = 0; i < progrLength; i++) {
            ret[i] = progrStart + progrStep * i;
        }
        return ret;
    }

    private static String getProgressionString(int[] progressionArray, int missingMember) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progressionArray.length; i++) {
            if (i == 0) {
                sb.append(String.valueOf(progressionArray[i]));             // Missing element can't be first
            } else {
                if (progressionArray[i] == missingMember) {
                    sb.append(" ..");
                } else {
                    sb.append(" ");
                    sb.append(String.valueOf(progressionArray[i]));
                }
            }
        }
        return sb.toString();
    }

    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int progrStart = Utils.getRandom(1, MAX_PROGRESSION_START);
            // Progression start number;
            int progrLength = Utils.getRandom(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            // Progression length;
            int progrStep = Utils.getRandom(2, MAX_PROGRESSION_STEP);
            // Progression step;
            int missingMemberIndex = Utils.getRandom(1, progrLength - 2);
            // Progression missing member index
            // exclude first and last members (zero-based);
            int missingMember = progrStart + missingMemberIndex * progrStep;
            // Progression missing member value;

            String[] questionAndAnswer = new String[2];
            int[] progressionArray = generateProgressionArray(progrStart, progrLength, progrStep);
            questionAndAnswer[0] = getProgressionString(progressionArray, missingMember);
            questionAndAnswer[1] = String.valueOf(missingMember);
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
