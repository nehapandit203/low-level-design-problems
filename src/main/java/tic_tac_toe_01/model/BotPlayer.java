package tic_tac_toe_01.model;

import tic_tac_toe_01.service.botPlayerStrategy.BotPlayingStrategy;

public class BotPlayer extends Player{

    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Symbol symbol) {
        super(name, symbol);
    }
}
