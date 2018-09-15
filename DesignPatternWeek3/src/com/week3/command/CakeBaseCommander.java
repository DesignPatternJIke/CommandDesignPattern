package com.week3.command;

public class CakeBaseCommander {
	// CakeCommand members
    private CakeCommand chocolateCommand, strawberryCommand;

    public CakeBaseCommander(CakeCommand ChocolateCommand, CakeCommand StrawberryCommand) {
        chocolateCommand = ChocolateCommand; 
        strawberryCommand = StrawberryCommand;
        
    }
    // Chocolate method
    public void chocolateCake() {
        chocolateCommand.execute();

    }
    // Strawberry method
    public void strawberryCake() {
        strawberryCommand.execute();
    }

 
}
