package hexlet.code.games;

import hexlet.code.Rand;

public final class Progression implements Game {

    private String gameHeader = "What number is missing in the progression?";
    private int progrStart;
    private int progrLength;
    private int progrStep;
    private int missingMemberIndex;
    private int missingMember;

    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {

        progrStart = Rand.get(1, 89);                                  // Progression start number
        progrLength = Rand.get(5, 10);                            // Progression length
        progrStep = Rand.get(2, 9);                               // Progression step
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
}
