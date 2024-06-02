package tictactoe.service.winingStategy;

import tictactoe.model.Board;
import tictactoe.model.Symbol;

public interface WinningStratergy  {

    boolean checkWinner(int row, int column, Symbol symbol, Board gameBoard);
}
