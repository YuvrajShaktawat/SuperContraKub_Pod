package com.example.FirstProject.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("this is up method");
		
	}
	
	public void down() {
		System.out.println("this is down method");
		
	}
	public void right() {
		System.out.println("this is right method");
		
	}
	public void left() {
		System.out.println("this is left method");
		
	}
	

}
