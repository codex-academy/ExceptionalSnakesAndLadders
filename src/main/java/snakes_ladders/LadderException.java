package snakes_ladders;

public class LadderException extends PositionException {

    private int  ladderTop;
    public LadderException(int ladderTop) {
        super(ladderTop);
        this.ladderTop = ladderTop;
    }

    public int getLadderTop() {
        return ladderTop;
    }

    public String getMessage() {
        return String.format("You hit a ladder and moved to position %d", ladderTop);
    }
}
