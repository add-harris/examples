package com.example.javacommandlineapp;

import com.example.javacommandlineapp.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCommandLineAppApplication implements CommandLineRunner {

	private final GameService gameService;

	@Autowired
	public JavaCommandLineAppApplication(GameService gameService) {
		this.gameService = gameService;
	}


	public static void main(String[] args) {
		SpringApplication.run(JavaCommandLineAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		gameService.play();

	}
}
