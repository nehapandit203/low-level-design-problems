package tictactoe.strategies.botplayingstrategies;


import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.CellState;
import tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row: board.getBoard()) {
            for (Cell cell: row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(
                            cell,
                            null
                    );
                }
            }
        }
        return null;
    }
}
