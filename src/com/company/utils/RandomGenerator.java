package com.company.utils;

import java.util.Random;

public class RandomGenerator {
    Random random;

    public RandomGenerator() {
        random = new Random();

    }

    public int generateRandomNumberBound10() {
        return random.nextInt(9) + 1;

    }
}
