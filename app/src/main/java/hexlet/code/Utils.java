package hexlet.code;

public class Utils {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 99;

    public static int getRandom(int minRandValue, int maxRandValue) {
        return minRandValue + (int) (Math.random() * ((maxRandValue - minRandValue) + 1));
    }

    public static int getRandom() {
        return getRandom(MIN_RANDOM, MAX_RANDOM);
    }
}
