package tic_tac_toe_01.service.winingStategy;

import tic_tac_toe_01.model.Board;
import tic_tac_toe_01.model.Symbol;

public interface WinningStratergy  {

    boolean checkWinner(int row, int column, Symbol symbol, Board gameBoard);
}
