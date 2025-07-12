package com.example.FirstProject.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	MarioGame game;
	@Autowired
	GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		game.up();
		game.down();
		game.right();
		game.left();
		
	}

}
