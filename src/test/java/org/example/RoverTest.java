package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    @DisplayName("Returns correct direction when rotated left")
    void returnCorrectDirectionWhenRotatedLeft(){
        //starting point
        Position position = new Position(0,0,CompassDirection.N);
        
        
        position.move('L');
        assertEquals(CompassDirection.W, position.getFacing());

        position.move('L');
        assertEquals(CompassDirection.S, position.getFacing());

        position.move('L');
        assertEquals(CompassDirection.E, position.getFacing());

        position.move('L');
        assertEquals(CompassDirection.N, position.getFacing());
    }

    @Test
    @DisplayName("Returns correct direction when rotated right")
    void returnCorrectDirectionWhenRotatedRight() {
        //starting point
        Position position = new Position(0,0,CompassDirection.N);

        position.move('R');
        assertEquals(CompassDirection.E, position.getFacing());

        position.move('R');
        assertEquals(CompassDirection.S, position.getFacing());

        position.move('R');
        assertEquals(CompassDirection.W, position.getFacing());

        position.move('R');
        assertEquals(CompassDirection.N, position.getFacing());
    }

    @Test
    @DisplayName("Returns correct direction when moved")
    void returnsCorrectDirectionWhenMoved() {
        Position position = new Position(0,0,CompassDirection.N);

        position.move('M');
        assertEquals(0, position.getX());
        assertEquals(1, position.getY());

        position.move('R'); // Face East
        position.move('M');
        assertEquals(1, position.getX());
        assertEquals(1, position.getY());

        position.move('R'); // Face South
        position.move('M');
        assertEquals(1, position.getX());
        assertEquals(0, position.getY());

        position.move('R'); // Face West
        position.move('M');
        assertEquals(0, position.getX());
        assertEquals(0, position.getY());

    }
}