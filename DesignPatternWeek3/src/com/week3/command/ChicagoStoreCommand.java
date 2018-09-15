package com.week3.command;

public class ChicagoStoreCommand {

    private String name;


    public void chcolateCake() {
        System.out.println(getName() + " store recieved command for Chocolate cake. Chocolate cake order has been sent to the factory\n ");
    }


    public void strawberryCake() {
    	  System.out.println(getName() + " store recieved command for strawberry cake. Strawberry cake order has been sent to the factory\n ");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "Chicago";
    }
}
