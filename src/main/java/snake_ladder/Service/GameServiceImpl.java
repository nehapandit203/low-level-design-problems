package snake_ladder.Service;


import snake_ladder.models.Game;
import snake_ladder.models.Player;
import snake_ladder.strategy.IBoardMoveStratgy;

import java.util.Queue;
import java.util.Scanner;

public class GameServiceImpl implements IGameService {
    IBoardMoveStratgy moveStrategy;

    public GameServiceImpl(IBoardMoveStratgy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    @Override
    public Queue<Player> run(Game game) {
        BoardService boardService = new BoardService(game.getBoard());
        boardService.addEntity(game.getBoard());
        boardService.print(game.getBoard());


        while (game.getPlayerList().size() > 1) {
            Player currentPlayer = game.getPlayerList().poll();
            System.out.print("\n\nPlayer " + currentPlayer.getName().toUpperCase() + " its your turn !!");
            System.out.println(" Press r to roll a dice ...!");

            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            int playerNewPosition = moveStrategy.makeMove(currentPlayer, game);// TODO:

            if (currentPlayer.getPosition() == game.getBoard().getTotalCells()) {
                System.out.println(currentPlayer.getName() + " won!!!");
                game.getWinnerList().add(currentPlayer);
                break;
            } else
                game.getPlayerList().add(currentPlayer);

            if (playerNewPosition == 100) { //We can create separate winning statergy class
                //Winner based on reaching first player 100
                //Winner until all player reacches 100
                String winner = currentPlayer.getName();
                System.out.println("Game Ended winner is :: " + winner);
                break;
            }
        }
        return game.getWinnerList();
    }


}
