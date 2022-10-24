package com.github.curriculeon;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Locale;
import java.util.function.Supplier;

public enum GameCreator {
    TIC_TAC_TOE(TicTacToeGame::new),
    ROCK_PAPER_SCISSORS(RockPaperScissors::new),
    SLOTS(SlotsGame::new),
    BLACKJACK(BlackJackGame::new);

    private Supplier<GameInterface> gameSupplier;

    GameCreator(Supplier<GameInterface> gameSupplier) {
        this.gameSupplier = gameSupplier;
    }

    public Supplier<GameInterface> getGameSupplier() {
        return gameSupplier;
    }


    public static GameCreator getValueOf(String userInput) {
        return valueOf(
                userInput
                        .toUpperCase(Locale.ROOT)
                        .replaceAll(" ", "_"));
    }
}

