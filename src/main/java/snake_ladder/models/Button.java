package snake_ladder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Button {
    private String color;

    public Button(String color){
        this.color = color;
    }
}
