package tictactoe;

import tictactoe.controller.TicTacToeGame;

public class Main {
    public static void main(String[] args) {
        //We can also pass the arguments of player and Board
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.start());


        //This problem can be solved in O(1) Time complexity using n-queens problems
        //TODO: Later in O(1)
    }
}
