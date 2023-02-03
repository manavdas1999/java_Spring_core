package com.manav.maven_demo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("Bike bhaag rhi hai!");
	}
}
