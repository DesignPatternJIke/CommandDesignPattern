package com.week3.command;

public class NewYorkChocolateCommand implements CakeCommand {
    private NewYorkStoreCommand newYorkStoreCommand;

    public NewYorkChocolateCommand(NewYorkStoreCommand newYorkStoreCommand) {
        this.newYorkStoreCommand = newYorkStoreCommand;
    }

    @Override
    public void execute() {
        newYorkStoreCommand.chcolateCake();

    }
}
