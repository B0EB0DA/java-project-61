package hexlet.code.games;

import hexlet.code.Rand;

public class GCD implements Game{
    private String gameHeader = "Find the greatest common divisor of given numbers.";
    private int firstOperand;
    private int secondOperand;
    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {
        firstOperand = Rand.Get();
        secondOperand = Rand.Get();
        return String.valueOf(firstOperand) + " " + String.valueOf(secondOperand);
    }
    public String getAnswer() {

        int op1 = firstOperand;
        int op2 = secondOperand;

        while (true)
            if (op1 > op2) {
                op1 = op1 % op2;
                if (op1 == 0) return String.valueOf(op2);
            } else {
                op2 = op2 % op1;
                if (op2 == 0) return String.valueOf(op1);
            }
    }
}
