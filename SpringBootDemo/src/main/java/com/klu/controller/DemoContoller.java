package com.klu.controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {
	Scanner reader = new Scanner(System.in);
	int a = reader.nextInt();
	int b = reader.nextInt();
	@GetMapping("/hai")
	public String sayHello() {
		return "Welocme to SpringBoot Application";
	}
	@GetMapping("/sum")
	public int getSum() {
		return a+b;
	}
}
