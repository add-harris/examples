package com.example.javacommandlineapp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GameService {

    public static Logger logger = LoggerFactory.getLogger(GameService.class);

    public void play() {

        logger.info("app started");
        logger.info("what is your name?");

        String name = System.console().readLine();

        logger.info("hi " + name);
        logger.info("how old are you?");

        // crashes app if cannot be parsed as int
        Integer age = Integer.parseInt(System.console().readLine());

        logger.info("success!!");

    }

}
