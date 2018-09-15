package com.week3.command;

public class NewYorkStoreCommand {
	// Name data member
    private String name;
    

// Message for Chocolate cake
    public void chcolateCake() {
        System.out.println(getName() + " store recieved command for chocolate cake. Chocolate cake order has been sent to the factory\n ");
    }


 // Message for Strawberry cake
    public void strawberryCake() {
    	  System.out.println(getName() + " store recieved command for strawberry cake. Strawberry cake order has been sent to the factory\n ");
    }


    // You can use this in Main.java file.....
    public void setName(String name) {
        this.name = name;
    }

    // Required to check the name in JUnit test cases. Provide the (State) name of cake ordered.
    public String getName() {
        return  "New York";
    }
}

