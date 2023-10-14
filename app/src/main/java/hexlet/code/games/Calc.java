package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public final class Calc {
    private static String gameHeader = "What is the result of the expression?";
    private static final int MAX_OPERAND_INDEX = 2;                                 // index in array, zero based
    private static final int GAME_CYCLES = 3;

    private static int getCalcResult(int operand1, int operand2, char operation) {
        if (operation == '+') {
            return operand1 + operand2;
        } else if (operation == '-') {
            return operand1 - operand2;
        } else {
            return operand1 * operand2;
        }
    }

    public static void startGame(Scanner consoleScanner) {
        String[][] gameData = new String[GAME_CYCLES][];
        for (int i = 0; i < GAME_CYCLES; i++) {
            int firstOperand = Utils.getRandom();
            int secondOperand = Utils.getRandom();
            char[] operationTypes = new char[] {'+', '-', '*'};
            char operandSign = operationTypes[Utils.getRandom(0, MAX_OPERAND_INDEX)];
            String[] questionAndAnswer = new String[2];
            questionAndAnswer[0] = String.valueOf(firstOperand) + operandSign + String.valueOf(secondOperand);
            questionAndAnswer[1] = String.valueOf(getCalcResult(firstOperand, secondOperand, operandSign));
            gameData[i] = questionAndAnswer;
        }
        Engine.runGame(gameHeader, gameData, consoleScanner);
    }
}
