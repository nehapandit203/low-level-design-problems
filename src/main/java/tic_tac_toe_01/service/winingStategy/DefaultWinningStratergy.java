package tic_tac_toe_01.service.winingStategy;

import tic_tac_toe_01.model.Board;
import tic_tac_toe_01.model.Symbol;

public class DefaultWinningStratergy implements WinningStratergy {

    @Override
    /*Can be optimized with N Queens 2 problem in TC: O(1)*/
    public boolean checkWinner(int row, int column, Symbol symbol,Board gameBoard) {
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
