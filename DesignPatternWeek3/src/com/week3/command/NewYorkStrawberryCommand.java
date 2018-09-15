package com.week3.command;

public class NewYorkStrawberryCommand implements CakeCommand {

    private NewYorkStoreCommand marioCharacter;

    public NewYorkStrawberryCommand(NewYorkStoreCommand marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.strawberryCake();

    }
}
