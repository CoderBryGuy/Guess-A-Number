package com.bryan;

import java.util.Random;

public class NumberGeneratorImpl implements  NumberGenerator{


    //== fields ==
    private final Random random = new Random();

    private final int maxNumber = 100;

    //== pubic methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
