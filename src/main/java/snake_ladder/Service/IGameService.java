package snake_ladder.Service;

import org.springframework.stereotype.Service;
import snake_ladder.models.Game;
import snake_ladder.models.Player;

import java.util.Queue;

@Service
public interface IGameService {
   Queue<Player> run(Game game);
}
