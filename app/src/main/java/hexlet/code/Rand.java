package hexlet.code;

public class Rand {
    static final int minRandom = 0;
    static final int maxRandom = 99;

    public static int Get(int minRandValue, int maxRandValue)
    {
        return minRandValue + (int) (Math.random() * ((maxRandValue - minRandValue) + 1));
    }
    public static int Get()
    {
        return Get(minRandom, maxRandom);
    }
}
