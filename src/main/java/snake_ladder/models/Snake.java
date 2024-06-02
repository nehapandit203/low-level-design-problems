package snake_ladder.models;

import lombok.Getter;
import lombok.Setter;
import snake_ladder.enums.CellType;

@Getter
@Setter
public class Snake extends CellEntity{
    int startIndex;
    int endIndex;

    public Snake(int startIndex, int endIndex){
        super(CellType.S);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public String getMessage() {
        return "Opps! Snake Encountered Bad Luck";
    }

    @Override
    public String getSymbol() {
        return "S";
    }

    @Override
    public int nextLocation() {
        return this.endIndex;
    }
}
