package snakes_ladders;

import java.util.HashMap;
import java.util.Map;

public class ExceptionalSnakesAndLadders {

    private int position = 0;
    private String message;

    Map<Integer, PositionException> positionExceptionMap = new HashMap<>();

    public ExceptionalSnakesAndLadders(){

        positionExceptionMap.put(7, new LadderException(39));
        positionExceptionMap.put(18, new LadderException(67));
        positionExceptionMap.put(25, new LadderException(82));
        positionExceptionMap.put(39, new LadderException(94));

        positionExceptionMap.put(98, new SnakeException(2));
        positionExceptionMap.put(52, new SnakeException(45));
        positionExceptionMap.put(89, new SnakeException(66));
        positionExceptionMap.put(73, new SnakeException(20));

    }

    public void move(int count) {
        // not moved yet
        position += count;
        setMessage(String.format("Moved to position %d", position));

        try {
            handlePosition();
        }
        catch (PositionException ex) {

            position = ex.getPositionToMoveToo();
            setMessage(ex.getMessage());

        }

    }

    private void handlePosition() throws PositionException {
        PositionException positionException = positionExceptionMap.get(position);
        if (positionException != null) {
            throw positionException;
        }
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

    public int currentPosition() {
        return position;
    }

}
