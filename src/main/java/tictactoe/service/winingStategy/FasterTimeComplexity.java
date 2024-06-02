package tictactoe.service.winingStategy;

import tictactoe.model.Board;
import tictactoe.model.Symbol;

public class FasterTimeComplexity implements WinningStratergy {
    @Override
    public boolean checkWinner(int row, int column, Symbol symbol, Board gameBoard) {
        return false;
    }
}
