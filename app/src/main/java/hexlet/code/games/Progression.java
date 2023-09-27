package hexlet.code.games;

import hexlet.code.Rand;

public final class Progression implements Game {

    private String gameHeader = "What number is missing in the progression?";
    private int progrStart;
    private int progrLength;
    private int progrStep;
    private int missingMemberIndex;
    private int missingMember;

    private static final int MAX_PROGRESSION_START = 89;
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MAX_PROGRESSION_STEP = 9;

    public String getHeader() {
        return gameHeader;
    }
    public String getQuestion() {

        progrStart = Rand.get(1, MAX_PROGRESSION_START);                                // Progression start number
        progrLength = Rand.get(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);         // Progression length
        progrStep = Rand.get(2, MAX_PROGRESSION_STEP);                                  // Progression step
        missingMemberIndex = Rand.get(1, progrLength - 2);        // Progression missing member index,
                                                                        // exclude first and last members (zero-based)

        missingMember = progrStart + missingMemberIndex * progrStep;    // Progression missing member value
        StringBuilder sb = new StringBuilder(String.valueOf(progrStart));

        for (int i = progrStart + progrStep; i < progrStart + progrLength * progrStep; i += progrStep) {
            if (i == missingMember) {
                sb.append(" ..");
            } else {
                sb.append(" ");
                sb.append(String.valueOf(i));
            }
        }
        return sb.toString();
    }
    public String getAnswer() {
        return String.valueOf(missingMember);
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
