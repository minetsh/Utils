package me.kareluo.utils.value;

import java.util.Random;

import me.kareluo.utils.Utils;

/**
 * Created by felix on 16/4/29.
 */
public class RandomUtils {

    private static Random RANDOM = new Random();

    private RandomUtils() {
        throw new IllegalAccessError(Utils.INSTANTIATE_ERROR);
    }

    public static void reset() {
        RANDOM = new Random();
    }

    public static void reset(long seed) {
        RANDOM.setSeed(seed);
    }

    public static int randomInt() {
        return RANDOM.nextInt();
    }

    public static int randomInt(int n) {
        return RANDOM.nextInt(n);
    }

    public static boolean randomBoolean() {
        return RANDOM.nextBoolean();
    }

    public static double randomDouble() {
        return RANDOM.nextDouble();
    }

    public static double randomGaussian() {
        return RANDOM.nextGaussian();
    }

    public static float randomFloat() {
        return RANDOM.nextFloat();
    }

    public static long randomLong() {
        return RANDOM.nextLong();
    }

    public static void randomBytes(byte[] bytes) {
        RANDOM.nextBytes(bytes);
    }
}
