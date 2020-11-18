package snakes_ladders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionalSnakesAndLaddersTests {

    @Test
    public void testThatWeCanMove() {

        ExceptionalSnakesAndLadders sal = new ExceptionalSnakesAndLadders();

        sal.move(4);
        sal.move(1);

        assertEquals(5,sal.currentPosition());
        assertEquals("Moved to position 5",sal.message());
    }

    @Test
    public void testThatWeCanMoveThreeTimesInARow() {

        ExceptionalSnakesAndLadders sal = new ExceptionalSnakesAndLadders();

        sal.move(4);
        assertEquals(4, sal.currentPosition());
        assertEquals("Moved to position 4", sal.message());

        sal.move(5);
        assertEquals(9, sal.currentPosition());
        assertEquals("Moved to position 9", sal.message());

        sal.move(6);
        assertEquals(15, sal.currentPosition());
        assertEquals("Moved to position 15", sal.message());

    }

    @Test
    public void testThatWeCanHandleLadders() {

        ExceptionalSnakesAndLadders sal = new ExceptionalSnakesAndLadders();

        sal.move(3);
        sal.move(4);

        assertEquals(39, sal.currentPosition());
        assertEquals("You hit a ladder and moved to position 39", sal.message());
    }

    @Test
    public void testThatWeCanHandleAnotherLadder() {

        ExceptionalSnakesAndLadders sal = new ExceptionalSnakesAndLadders();

        sal.move(5);
        sal.move(5);
        sal.move(5);
        sal.move(5);
        sal.move(3);
        sal.move(2);

        assertEquals(82, sal.currentPosition());
        assertEquals("You hit a ladder and moved to position 82", sal.message());
    }

    @Test
    public void testThatWeCanHandleASnake() {

        ExceptionalSnakesAndLadders sal = new ExceptionalSnakesAndLadders();

        sal.move(5);
        sal.move(5);
        sal.move(5);
        sal.move(5);
        sal.move(4);
        sal.move(6);
        sal.move(5);
        sal.move(5);
        sal.move(5);
        sal.move(5);
        sal.move(2);


        assertEquals(45, sal.currentPosition());
        assertEquals("You got swallowed by a snake and moved to position 45", sal.message());
    }

}
