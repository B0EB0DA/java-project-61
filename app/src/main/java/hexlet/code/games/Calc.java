package hexlet.code.games;

import hexlet.code.Rand;
public final class Calc implements Game {
    private String gameHeader = "What is the result of the expression?";
    private int firstOperand;
    private int secondOperand;
    private int operandCode;        // 1 for + ; 2 for - ; 3 for * ;
    private String operandStr;
    private static final int MAX_OPERAND_INDEX = 3;
    public String getHeader() {
        return gameHeader;
    }
    public String getQuestion() {

        firstOperand = Rand.get();
        secondOperand = Rand.get();
        operandCode = Rand.get(1, MAX_OPERAND_INDEX);

        if (operandCode == 1) {
            operandStr = "+";
        } else if (operandCode == 2) {
            operandStr = "-";
        } else {
            operandStr = "*";
        }

        return String.valueOf(firstOperand) + " " + operandStr + " " + String.valueOf(secondOperand);
    }
    public String getAnswer() {
        if (operandCode == 1) {
            return String.valueOf(firstOperand + secondOperand);
        } else {
            if (operandCode == 2) {
                return String.valueOf(firstOperand - secondOperand);
            } else {
                return String.valueOf(firstOperand * secondOperand);
            }
        }
    }
    public String[] getGameData(int roundsNumber) {
        String[] bulGameData = new String[1 + 2 * roundsNumber];
        bulGameData[0] = getHeader();
        for (int i = 1; i <= roundsNumber * 2; i += 2) {
            bulGameData[i] = getQuestion();
            bulGameData[i + 1] = getAnswer();
        }
        return bulGameData;
    }
}
