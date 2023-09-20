package hexlet.code.games;

import hexlet.code.Rand;

public class Prime implements Game{
    private String gameHeader = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private int theOperand;
    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {

        theOperand = Rand.Get(10, 999);
        return String.valueOf(theOperand);
    }
    public String getAnswer() {
        if (theOperand % 2 == 0) return "no";
        for (int i = 3; i <= Math.sqrt(theOperand); i += 2) {
            if (theOperand % i == 0) return "no";
        }
        return "yes";
    }
}
