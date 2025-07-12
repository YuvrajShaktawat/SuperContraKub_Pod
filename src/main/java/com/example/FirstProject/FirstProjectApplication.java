package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.FirstProject.game.GameRunner;
import com.example.FirstProject.game.GamingConsole;
import com.example.FirstProject.game.MarioGame;
import com.example.FirstProject.game.SuperContra;
import com.sun.tools.javac.Main;

@SpringBootApplication
public class FirstProjectApplication {

	public static void Main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Main.class, args); 
//		MarioGame mario = new MarioGame();
//		GamingConsole mario = new SuperContra();
//		GameRunner runner = new GameRunner(mario);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
