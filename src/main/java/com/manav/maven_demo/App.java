package com.manav.maven_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// this is fixed or hard-coded, cannot be changed
//        Car vehicle = new Car();
        
    	// to reduce tight coupling lets use Vehicle interface, but this we have hard-coding on right side
//    	Vehicle vehicle = new Car();
    	
    	// using bean to remove all hard-coding
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle vehicle = (Vehicle)context.getBean("bike");
//    	
//        vehicle.drive();
        
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Tyre t = (Tyre)context.getBean("tyre");
    	
        System.out.println(t.toString());
        
        
    }
}
