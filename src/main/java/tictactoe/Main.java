package tictactoe;

import tictactoe.controller.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        //We can also pass the arguments of player and Board
        game.initializeGame();
        game.start();
        System.out.println("Game Winner is : ");

        //This problem can be solved in O(1) Time complexity using n-queens problems
        //TODO: Later in O(1)
    }
}
