package snakes_ladders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionalSnakesAndLaddersTests {

    @Test
    public void testWeCanMove() {

        ExceptionalSnakesAndLadders sal = new ExceptionalSnakesAndLadders();

        sal.move(4);
        sal.move(1);

        assertEquals(5,sal.currentPosition());
    }

}
