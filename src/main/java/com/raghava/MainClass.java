package com.raghava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
	   
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

			/*
			 * in single ton only one instance will be created and it spring container will
			 * be giving same instance so even though we are accessing objB.getMeassage
			 *  
			 *  outut will be 
			 *  	Your Message : I'm object A 
			 *		Your Message : I'm object A
			 */	      
	      
	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage();
	   }
	
}
