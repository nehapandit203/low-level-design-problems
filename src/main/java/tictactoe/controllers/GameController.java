package tictactoe.controllers;


import tictactoe.exceptions.DuplicateSymbolException;
import tictactoe.exceptions.MoreThanOneBotException;
import tictactoe.exceptions.PlayersCountDimensionMismatchException;
import tictactoe.models.Game;
import tictactoe.models.GameState;
import tictactoe.models.Player;
import tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimensionOfBoard,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {
//        Game.Builder.setPlayers(....)
//        .setWinningStrategies(...)
//        .build();
//
//        Game.Builder.addPlayer(..).addPlayer(..)
//        .addWinningStrategy().build();

        return Game.getBuilder()
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .setDimension(dimensionOfBoard)
                .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public void undo(Game game) {
        game.undo();
    }
}
