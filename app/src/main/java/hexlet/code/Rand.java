package hexlet.code;

public class Rand {
    static final int MinRandom = 1;
    static final int MaxRandom = 99;

    public static int get(int minRandValue, int maxRandValue) {
        return minRandValue + (int) (Math.random() * ((maxRandValue - minRandValue) + 1));
    }
    public static int get() {
        return get(MinRandom, MaxRandom);
    }
}
