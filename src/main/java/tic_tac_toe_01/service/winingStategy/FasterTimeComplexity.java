package tic_tac_toe_01.service.winingStategy;

import tic_tac_toe_01.model.Board;
import tic_tac_toe_01.model.Symbol;

public class FasterTimeComplexity implements WinningStratergy {
    @Override
    public boolean checkWinner(int row, int column, Symbol symbol, Board gameBoard) {
        return false;
    }
}
