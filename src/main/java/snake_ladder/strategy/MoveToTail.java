package snake_ladder.strategy;

import snake_ladder.models.*;

import java.util.Map;

public class MoveToTail implements IBoardMoveStratgy {
    @Override
    public int makeMove(Player currentPlayer, Game game) {
        Board board = game.getBoard();

        Map<Integer, CellEntity> cells = game.getBoard().getCells();

        int currentPos = currentPlayer.getPosition();
        int move = Dice.roll();
        int finalPos = currentPos+move;
        if(finalPos <= game.getDimension()){

            if(cells.containsKey(finalPos)){
                System.out.println(cells.get(finalPos).getSymbol()+" : "+cells.get(finalPos).getMessage());
                finalPos = cells.get(finalPos).nextLocation();
            }
            System.out.println("Taking you to new position ::  "+finalPos);
        }
        else{
            System.out.print(" Try Next Turn : Out of Range ");
            finalPos = currentPos;
        }
        currentPlayer.setPosition(finalPos);

        return finalPos;
    }
}
