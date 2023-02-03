package com.manav.maven_demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("Gaddi chal rhi hai!");
	}
}
