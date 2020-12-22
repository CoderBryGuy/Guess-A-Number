package com.bryan.config;

import com.bryan.GuessCount;
import com.bryan.MaxNumber;
import com.bryan.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    //== fields ==
    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.minNumber:2}")
    private int minNumber;

    @Value(("${game.guessCount:5}"))
    private int guessCount;

    // == beans ==
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }

    @Bean
    @GuessCount
    int guessCount(){
        return guessCount;
    }


}
