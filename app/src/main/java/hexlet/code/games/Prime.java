package hexlet.code.games;

import hexlet.code.Rand;

public final class Prime implements Game {
    private String gameHeader = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_VALUE = 10;
    private static final int MAX_VALUE = 999;
    private static final int PRIME_3 = 3;
    private int theOperand;
    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {

        theOperand = Rand.get(MIN_VALUE, MAX_VALUE);
        return String.valueOf(theOperand);
    }
    public String getAnswer() {
        if (theOperand % 2 == 0) {
            return "no";
        }
        for (int i = PRIME_3; i <= Math.sqrt(theOperand); i += 2) {
            if (theOperand % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
