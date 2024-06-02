package snake_ladder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private Button button;
    private Boolean canMove;
    private Integer position;
    private String name;

    public Player(Button pieceButton, String name){
        this.button = pieceButton;
        this.name = name;
        this.position = 0;
    }
}
