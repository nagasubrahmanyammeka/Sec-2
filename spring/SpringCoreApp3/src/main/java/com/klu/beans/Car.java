package com.klu.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car was Driving......");
		engine.stop();
	}
}
