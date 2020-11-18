package snakes_ladders;

public class PositionException extends Exception {

    int positionToMoveToo;

    public int getPositionToMoveToo() {
        return positionToMoveToo;
    }

    public PositionException(int positionToMoveToo) {
        this.positionToMoveToo = positionToMoveToo;
    }

}
