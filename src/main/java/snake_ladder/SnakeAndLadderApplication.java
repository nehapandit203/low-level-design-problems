package snake_ladder;


import org.springframework.boot.SpringApplication;
import snake_ladder.Service.GameServiceImpl;
import snake_ladder.Service.IGameService;
import snake_ladder.models.*;
import snake_ladder.strategy.MoveToTail;

import java.util.LinkedList;
import java.util.Queue;


public class SnakeAndLadderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakeAndLadderApplication.class, args);

        //Inputs needed
        Player p1 = new HumanPlayer(new Button("Green"), "Raj");//TODO: builder pattern
        Player p2 = new HumanPlayer(new Button("Blue"), "Ram");
        Player p3 = new ComputerPlayer(new Button("Red"), "Robot");

        Queue<Player> players = new LinkedList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        Game game = new Game();//builder
        game.setPlayerList(players);
        game.setMakeMove(new MoveToTail());

        IGameService gameController = new GameServiceImpl(new MoveToTail());
        gameController.run(game);
    }

}
