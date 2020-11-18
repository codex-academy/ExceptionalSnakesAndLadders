package snakes_ladders;

public class SnakeException extends PositionException {

    private int snakeTail;

    public SnakeException(int snakeTail){
        super(snakeTail);
        this.snakeTail = snakeTail;
    }

    public int getSnakeTail() {
        return snakeTail;
    }

    @Override
    public String getMessage() {
        return String.format("You got swallowed by a snake and moved to position %s", snakeTail);
    }
}
