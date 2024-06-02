package snake_ladder.Service;

import snake_ladder.models.Board;
import snake_ladder.models.CellEntity;
import snake_ladder.models.Ladder;
import snake_ladder.models.Snake;

import java.util.Map;

public class BoardService {
    private Board board;

    public BoardService(Board board) {
        this.board = board;
    }

    public  void addEntity(Board board){
        Map<Integer, CellEntity> cells = board.getCells();
        Snake snake1 = new Snake( 27, 8);
        Snake snake2 = new Snake( 89, 7);
        Snake snake3 = new Snake(90, 9);
        Snake snake4 = new Snake(55, 8);

        Ladder ladder1 = new Ladder(11, 56);
        Ladder ladder2 = new Ladder(4, 83);
        Ladder ladder3 = new Ladder(3, 31);
        Ladder ladder4 = new Ladder(7, 91);
        //   List<Cell> ls = new ArrayList<Cell>(Arrays.asList(snake1,snake2,snake3,snake4));
        //   List<Cell> ls1 = new ArrayList<>(Arrays.asList(ladder1,ladder2,ladder3,ladder4));

        cells.put(snake1.getStartIndex(),snake1);
        cells.put(snake2.getStartIndex(),snake2);
        cells.put(snake3.getStartIndex(),snake3);
        cells.put(snake4.getStartIndex(),snake4);

        cells.put(ladder1.getStartIndex(),ladder1);
        cells.put(ladder2.getStartIndex(),ladder2);
        cells.put(ladder3.getStartIndex(),ladder3);
        cells.put(ladder4.getStartIndex(),ladder4);

    }

    public boolean hasSnakeOrLadder(int cellIndex,Board board) {
        return board.getCells().containsKey(cellIndex);
    }

    public void print(Board board){

        for(int i = board.getDimension() ; i > 0; i--){
            if(this.hasSnakeOrLadder(i,board)){
                System.out.print(" "+board.getCells().get(i).getSymbol()+" ");
            }
            else
                System.out.print(" " +i+" ");

            if(i % 10 == 0 && i != 100)
                System.out.println();
        }
    }

}
