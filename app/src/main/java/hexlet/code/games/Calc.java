package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Rand;
import java.util.Scanner;

public final class Calc {
    private static String gameHeader = "What is the result of the expression?";
    private static final int MAX_OPERAND_INDEX = 3;
    private static final int GAME_CYCLES = 3;
    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int firstOperand = Rand.get();
            int secondOperand = Rand.get();
            int operandCode = Rand.get(1, MAX_OPERAND_INDEX);       // 1 for + ; 2 for - ; 3 for * ;
            String[] questionAndAnswer = new String[2];
            if (operandCode == 1) {
                questionAndAnswer[0] = String.valueOf(firstOperand) + " + " + String.valueOf(secondOperand);
                questionAndAnswer[1] = String.valueOf(firstOperand + secondOperand);
            } else if (operandCode == 2) {
                questionAndAnswer[0] = String.valueOf(firstOperand) + " - " + String.valueOf(secondOperand);
                questionAndAnswer[1] = String.valueOf(firstOperand - secondOperand);
            } else {
                questionAndAnswer[0] = String.valueOf(firstOperand) + " * " + String.valueOf(secondOperand);
                questionAndAnswer[1] = String.valueOf(firstOperand * secondOperand);
            }
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
