package snake_ladder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComputerPlayer extends Player{

    public ComputerPlayer(Button pieceButton, String name) {
        super(pieceButton,name);
    }
}
