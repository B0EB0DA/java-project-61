package hexlet.code.games;
import hexlet.code.Rand;
public final class Even implements Game {
    private String gameHeader = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private int theOperand;
    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {
        theOperand = Rand.get();
        return String.valueOf(theOperand);
    }
    public String getAnswer() {
        return theOperand % 2 == 0 ? "yes" : "no";
    }
}
