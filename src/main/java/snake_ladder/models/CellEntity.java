package snake_ladder.models;

import lombok.Getter;
import snake_ladder.enums.CellType;

@Getter
public abstract class CellEntity {
    private CellType cellType;

    public CellEntity(CellType cellType){
        this.cellType = cellType;
    }

    public abstract String getMessage();
    public abstract String getSymbol();
    public abstract int nextLocation();


}
