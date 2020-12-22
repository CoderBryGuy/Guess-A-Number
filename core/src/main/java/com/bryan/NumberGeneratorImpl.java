package com.bryan;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;


public class NumberGeneratorImpl implements  NumberGenerator{


    //== fields ==
    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;

    @Autowired
    @MinNumber
    private int minNumber;

    //== pubic methods ==
    @Override
    public int next() {
//        return random.nextInt(maxNumber);
        return random.nextInt((maxNumber - minNumber) + 1) + minNumber;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
