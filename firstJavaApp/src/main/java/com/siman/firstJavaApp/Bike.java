package com.siman.firstJavaApp;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("Challlooooo Yaarrooo bike ayaa gayooo....");
	}

}
