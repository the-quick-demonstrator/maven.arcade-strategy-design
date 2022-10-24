package com.github.curriculeon;

import com.github.curriculeon.utils.IOConsole;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        IOConsole console = new IOConsole();
        console.println("What game would you like to play?");
        String gameSelection = console.getStringInput(Arrays.toString(GameCreator.values()));
        GameCreator gameCreator = GameCreator.getValueOf(gameSelection);
        GameInterface gameInterface = gameCreator.getGameSupplier().get();
        System.out.println("Game type = " + gameInterface.getClass());
    }
}
