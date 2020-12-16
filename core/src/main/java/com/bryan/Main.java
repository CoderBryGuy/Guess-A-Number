package com.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
            log.info("Guess The Number Game");

        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        NumberGenerator numberGenerator
                = context.getBean( NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();
        log.info("number = {}", number);

        //get game bean from the context (container)
        Game game = context.getBean(Game.class);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        messageGenerator.getMainMessage();
        messageGenerator.getResultMessage();

        //call reset method
//        game.reset();

        // close context
        context.close();
    }
}
