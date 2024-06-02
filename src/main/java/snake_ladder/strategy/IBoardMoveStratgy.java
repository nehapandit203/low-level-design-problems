package snake_ladder.strategy;


import snake_ladder.models.Game;
import snake_ladder.models.Player;

public interface IBoardMoveStratgy {

    int makeMove(Player postion, Game game);
}
