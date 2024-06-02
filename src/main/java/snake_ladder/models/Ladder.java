package snake_ladder.models;

import lombok.Getter;
import lombok.Setter;
import snake_ladder.enums.CellType;

@Getter
@Setter
public class Ladder extends CellEntity{
    int startIndex;
    int endIndex;

    public Ladder(int startIndex,int endIndex){
        super(CellType.H);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public String getMessage() {
        return "Good Luck! You got a ladder";
    }
    @Override
    public String getSymbol() {
        return "H";
    }
    @Override
    public int nextLocation() {
        return this.endIndex;
    }
}
