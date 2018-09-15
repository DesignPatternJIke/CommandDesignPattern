package com.week3.command;

public class ChicagoChocolateCommand implements CakeCommand {

    private ChicagoStoreCommand chicagoStoreCommand;

    public ChicagoChocolateCommand(ChicagoStoreCommand chicagoStoreCommand) {
        this.chicagoStoreCommand = chicagoStoreCommand;
    }

    @Override
    public void execute() {
        chicagoStoreCommand.chcolateCake();

    }
}
