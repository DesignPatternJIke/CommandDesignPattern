package com.week3.command.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.week3.command.ChicagoChocolateCommand;
import com.week3.command.ChicagoStoreCommand;
import com.week3.command.ChicagoStrawberryCommand;
import com.week3.command.NewYorkChocolateCommand;
import com.week3.command.NewYorkStoreCommand;
import com.week3.command.NewYorkStrawberryCommand;

/**
 * @author Justice Ike Object Oriented Design Pattern Course Week 3: Command Design Pattern
 * 
 *         Activity: Used week2 Factory design pattern (theme) for week3 Command design project.
 *       
  *  References: 
 *         
 *          JAVA:
 *			https://www.udemy.com/java-design-patterns-the-complete-masterclass/learn/v4/t/lecture/8931950?start=0
 *			https://www.udemy.com/design-patterns-in-java-concepts-hands-on-projects/learn/v4/t/lecture/9604754?start=0
 *			
 *			C++:
 *			https://www.udemy.com/patterns-cplusplus/learn/v4/t/lecture/7736712?start=0
 *			
 *			How to run the program:
 *
 *			JUnitTest: CommandCakeTest.java
 *        
 *			 **/

public class CommandCakeTest {

	// Test for New York Strawberry and Chocolate cake commands
	@Test
	public void checkNYCakeCommands() {

		// create and initialize NY Command store object
		NewYorkStoreCommand newYorkCommand = new NewYorkStoreCommand();

		// Create New York Strawberry commands
		NewYorkStrawberryCommand newYorkStrawberryCommand = new NewYorkStrawberryCommand(newYorkCommand);
		newYorkStrawberryCommand.execute();

		// Create New York Chocolate commands
		NewYorkChocolateCommand newYorkChocolateCommand = new NewYorkChocolateCommand(newYorkCommand);
		newYorkChocolateCommand.execute();

	//	assertEquals("New York", newYorkChocolateCommand2.getName());
		assertEquals("New York", newYorkCommand.getName());

	}
	
	
	/////////////////////
	// Test for Chicago Strawberry and Chocolate cake commands
		@Test
		public void checkChicagoCakeCommands() {

			// create and initialize NY Command store object
			ChicagoStoreCommand chicagoCommand = new ChicagoStoreCommand();

			// Create New York Strawberry commands
			ChicagoStrawberryCommand chicagoStrawberryCommand = new ChicagoStrawberryCommand(chicagoCommand);
			chicagoStrawberryCommand.execute();
			
			// Create Chicago Chocolate commands
			ChicagoChocolateCommand chicagoChocolateCommand = new ChicagoChocolateCommand(chicagoCommand);
			chicagoChocolateCommand.execute();

		//	assertEquals("New York", newYorkChocolateCommand2.getName());
			assertEquals("Chicago", chicagoCommand.getName());

		}
	

	

}
