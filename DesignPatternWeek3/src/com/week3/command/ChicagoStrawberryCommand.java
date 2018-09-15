package com.week3.command;

public class ChicagoStrawberryCommand implements CakeCommand{

    private ChicagoStoreCommand chicagoStoreCommand;

    public ChicagoStrawberryCommand(ChicagoStoreCommand chicagoStoreCommand) {
        this.chicagoStoreCommand = chicagoStoreCommand;
    }

    @Override
    public void execute() {
        chicagoStoreCommand.strawberryCake();
    }
}
