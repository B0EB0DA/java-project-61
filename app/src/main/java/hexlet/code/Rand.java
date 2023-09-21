package hexlet.code;

public class Rand {
    static final int MIN_RANDOM = 1;
    static final int MAX_RANDOM = 99;

    public static int get(int minRandValue, int maxRandValue) {
        return minRandValue + (int) (Math.random() * ((maxRandValue - minRandValue) + 1));
    }
    public static int get() {
        return get(MIN_RANDOM, MAX_RANDOM);
    }
}
