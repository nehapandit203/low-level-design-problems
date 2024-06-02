package tictactoe.controller;


import tictactoe.model.Board;
import tictactoe.model.Player;
import tictactoe.model.Symbol;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;

public class TicTacToeGame {
    private Board gameBoard;
    private Deque<Player> players;

    public void initializeGame() {
        players = new LinkedList<>();
        Player p1 = new Player("Player1", Symbol.X);
        Player p2 = new Player("Player2", Symbol.O);

        players.add(p1);
        players.add(p2);

        //hardcoing board size to 3-we can pass it from client
        gameBoard = new Board(3);

    }

    public String start() {
        Player currentPlayer = players.removeFirst();
        boolean winnerExist = true;

        while(winnerExist) {
            List<Pair<Integer, Integer>> freecells = gameBoard.getFreeCells();
            if (!freecells.isEmpty()) {
                winnerExist = false;
                continue;
            }
            gameBoard.printBoard();

            //reading the user input
            System.out.print("Player: " + currentPlayer.getName() + " Please Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, currentPlayer.getSymbol());
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

            boolean winner = checkWinner(inputRow, inputColumn, currentPlayer.getSymbol());
            if(winner) {
                return currentPlayer.getName();
            }
       }

        return "Tie!!";
    }

    /*Can be optimized with N Queens 2 problem in TC: O(1)*/
    private boolean checkWinner(int row, int column, Symbol symbol) {
            boolean rowMatch = true;
            boolean columnMatch = true;
            boolean diagonalMatch = true;
            boolean antiDiagonalMatch = true;

            //need to check in row
            for(int i=0;i<gameBoard.size;i++) {

                if(gameBoard.cell[row][i] == null || gameBoard.cell[row][i].getSymbol() != symbol) {
                    rowMatch = false;
                }
            }

            //need to check in column
            for(int i=0;i<gameBoard.size;i++) {

                if(gameBoard.cell[i][column] == null || gameBoard.cell[i][column].getSymbol() != symbol) {
                    columnMatch = false;
                }
            }

            //need to check diagonals
            for(int i=0, j=0; i<gameBoard.size;i++,j++) {
                if (gameBoard.cell[i][j] == null || gameBoard.cell[i][j].getSymbol() != symbol) {
                    diagonalMatch = false;
                }
            }

            //need to check anti-diagonals
            for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
                if (gameBoard.cell[i][j] == null || gameBoard.cell[i][j].getSymbol() != symbol) {
                    antiDiagonalMatch = false;
                }
            }
            return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }

}
