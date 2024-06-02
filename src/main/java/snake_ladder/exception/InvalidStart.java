package snake_ladder.exception;

public class InvalidStart extends Exception{

    private String message;

    public InvalidStart(String message){
        super(message);
    }
}
