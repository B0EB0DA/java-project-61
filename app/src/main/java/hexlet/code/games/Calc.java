package hexlet.code.games;

import hexlet.code.Rand;
public class Calc implements Game {
    private String gameHeader = "What is the result of the expression?";
    private int firstOperand;
    private int secondOperand;
    private int operandCode;        // 1 for + ; 2 for - ; 3 for * ;
    private String operandStr;
    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {

        firstOperand = Rand.Get();
        secondOperand = Rand.Get();
        operandCode = Rand.Get(1, 3);

        if (operandCode == 1)
            operandStr = "+";
        else if (operandCode == 2)
            operandStr = "-";
        else
            operandStr = "*";

        return String.valueOf(firstOperand) + " " + operandStr + " " + String.valueOf(secondOperand);
    }
    public String getAnswer() {
        if (operandCode == 1)
            return String.valueOf(firstOperand + secondOperand);
        else if (operandCode == 2)
            return String.valueOf(firstOperand - secondOperand);
        else
            return String.valueOf(firstOperand * secondOperand);
    }
}
