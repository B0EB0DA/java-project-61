package hexlet.code.games;
public interface Game {
    String getHeader();
    String getQuestion();
    String getAnswer();
    String[] getGameData(int roundsNumber);
}
