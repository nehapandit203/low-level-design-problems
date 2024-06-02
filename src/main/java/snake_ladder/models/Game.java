package snake_ladder.models;

import lombok.Getter;
import lombok.Setter;
import snake_ladder.Constants;
import snake_ladder.strategy.IBoardMoveStratgy;

import java.util.LinkedList;
import java.util.Queue;

@Getter
@Setter
public class Game {
    private  Board board;
    private Queue<Player> winnerList;
    private Queue<Player> playerList;
    private int dimension = Constants.BOARD_SIZE;
    private int diceCount =Constants.DICE_COUNT;
    private IBoardMoveStratgy makeMove;

    public Game(){
        this.board= new Board(dimension);
        this.playerList = new LinkedList<>();
        this.winnerList = new LinkedList<>();
    }

}
