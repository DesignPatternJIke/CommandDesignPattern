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
        CakeBaseCommander chicagoCakeBaseCommander = new CakeBaseCommander(chicagoStrawberryCommand, chicagoChocolateCommand);
        chicagoCakeBaseCommander.strawberryCake();
        chicagoCakeBaseCommander.chocolateCake();
        
        //New York
        CakeBaseCommander nyCakeBaseCommander = new CakeBaseCommander(newYorkStrawberryCommand, newYorkChocolateCommand);
        nyCakeBaseCommander.strawberryCake();
        nyCakeBaseCommander.chocolateCake();

     




    }
}
