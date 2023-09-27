package hexlet.code.games;
import hexlet.code.Rand;
public final class Even implements Game {
    private String gameHeader = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private int theOperand;
    public String getHeader() {
        return gameHeader;
    }
    public String getQuestion() {
        theOperand = Rand.get();
        return String.valueOf(theOperand);
    }
    public String getAnswer() {
        return theOperand % 2 == 0 ? "yes" : "no";
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
