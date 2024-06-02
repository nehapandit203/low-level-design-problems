package snake_ladder.models;


import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Board {

    private int totalCells;
    private int dimension;
    private List<Snake> listSnakes;
    private List<Ladder> listLadders;
    private Map<Integer, CellEntity> cells;

    public Board(int dimension) {
        this.dimension = dimension;
        this.cells = new HashMap<>();
    }

}
