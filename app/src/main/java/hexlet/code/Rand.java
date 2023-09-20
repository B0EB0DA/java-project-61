package hexlet.code;

public class Rand {
    static int minRandom = 0;
    static int maxRandom = 99;

    public static int get(int minRandValue, int maxRandValue) {
        return minRandValue + (int) (Math.random() * ((maxRandValue - minRandValue) + 1));
    }
    public static int get() {
        return get(minRandom, maxRandom);
    }
}
