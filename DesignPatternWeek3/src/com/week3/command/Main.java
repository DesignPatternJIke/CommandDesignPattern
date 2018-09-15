package com.week3.command;


// The main.java file is for completeness for those that would download the program for various purposes.
public class Main {

    public static void main(String[] args) {

        // Create our receivers
        NewYorkStoreCommand newYork = new NewYorkStoreCommand();
        newYork.setName("New York");

        ChicagoStoreCommand chicago = new ChicagoStoreCommand();
        chicago.setName("Chicago");


        //Create commands
        NewYorkStrawberryCommand newYorkStrawberryCommand = new NewYorkStrawberryCommand(newYork);
        NewYorkChocolateCommand newYorkChocolateCommand = new NewYorkChocolateCommand(newYork);
       
        ChicagoStrawberryCommand chicagoStrawberryCommand = new ChicagoStrawberryCommand(chicago);
        ChicagoChocolateCommand chicagoChocolateCommand = new ChicagoChocolateCommand(chicago);
       

  
        // Chicago
        CakeBaseCommander gameBoy2 = new CakeBaseCommander(chicagoStrawberryCommand, chicagoChocolateCommand);
        gameBoy2.strawberryCake();
        gameBoy2.chocolateCake();
        
        //New York
        CakeBaseCommander cakeBaseCommander = new CakeBaseCommander(newYorkStrawberryCommand, newYorkChocolateCommand);
        cakeBaseCommander.strawberryCake();
        cakeBaseCommander.chocolateCake();

     




    }
}
