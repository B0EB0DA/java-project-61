package hexlet.code.games;

import hexlet.code.Rand;

public class Progression implements Game{

    private String gameHeader = "What number is missing in the progression?";
    private int progressionStart;
    private int progressionLength;
    private int progressionStep;
    private int missingMemberIndex;
    private int missingMember;

    public String getHeader() {
        return gameHeader;
    }
    public String nextQuestion() {

        progressionStart = Rand.Get(1, 89);                                  // Progression start number
        progressionLength = Rand.Get(5, 10);                            // Progression length
        progressionStep = Rand.Get(2, 9);                               // Progression step
        missingMemberIndex = Rand.Get(1, progressionLength - 2);        // Progression missing member index,
                                                                        // exclude first and last members (zero-based)

        missingMember = progressionStart + missingMemberIndex * progressionStep;    // Progression missing member value
        StringBuilder sb = new StringBuilder(String.valueOf(progressionStart));

        for (int i = progressionStart + progressionStep; i < progressionStart + progressionLength * progressionStep; i += progressionStep) {
            if (i == missingMember) {
                sb.append(" .. ");
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
