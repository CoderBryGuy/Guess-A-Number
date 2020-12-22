package com.bryan.console;

import com.bryan.config.AppConfig;
import com.bryan.MessageGenerator;
import com.bryan.NumberGenerator;
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
        MessageGenerator messageGenerator =
                context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());


        //== close context ==
        context.close();
    }
}
