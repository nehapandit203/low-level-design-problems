package tictactoe.model;

import tictactoe.service.botPlayerStrategy.BotPlayingStrategy;

public class BotPlayer extends Player{

    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(String name, Symbol symbol) {
        super(name, symbol);
    }
}
