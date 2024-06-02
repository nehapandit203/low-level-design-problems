package tic_tac_toe.service.winingStategy;

import tic_tac_toe.model.Board;
import tic_tac_toe.model.Symbol;

public class FasterTimeComplexity implements WinningStratergy {
    @Override
    public boolean checkWinner(int row, int column, Symbol symbol, Board gameBoard) {
        return false;
    }
}
