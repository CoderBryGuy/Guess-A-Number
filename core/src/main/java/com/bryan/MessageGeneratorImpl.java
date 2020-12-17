package com.bryan;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageGeneratorImpl implements MessageGenerator{

    @Autowired
    Game game;

    int guessCount;

    @Override
    public String getMainMessage() {
        System.out.println("getMainMessage()");
        return "getMainMessage";
    }

    @Override
    public String getResultMessage() {
        System.out.println("getResultMessage()");
        return "getResultMessage()";
    }
}
