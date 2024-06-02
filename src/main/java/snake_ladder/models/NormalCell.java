package snake_ladder.models;


import snake_ladder.enums.CellType;

public class NormalCell extends CellEntity{
    public NormalCell(CellType cellType) {
        super(cellType);
    }
    public String getMessage() {
        return "Normal-Cell";
    }
    @Override
    public String getSymbol() {
        return " ";
    }

    @Override
    public int nextLocation() {
        return 0;
    }
}
