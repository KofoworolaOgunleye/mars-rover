package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverPositionTest {
    @Test
    @DisplayName("Returns correct direction when rotated left")
    void returnCorrectDirectionWhenRotatedLeft(){
        //starting point
        RoverPosition roverPosition = new RoverPosition(0,0,CompassDirection.N);

        roverPosition.move('L');
        assertEquals(CompassDirection.W, roverPosition.getFacing());

        roverPosition.move('L');
        assertEquals(CompassDirection.S, roverPosition.getFacing());

        roverPosition.move('L');
        assertEquals(CompassDirection.E, roverPosition.getFacing());

        roverPosition.move('L');
        assertEquals(CompassDirection.N, roverPosition.getFacing());
    }

    @Test
    @DisplayName("Returns correct direction when rotated right")
    void returnCorrectDirectionWhenRotatedRight() {
        //starting point
        RoverPosition roverPosition = new RoverPosition(0,0,CompassDirection.N);
        roverPosition.move('R');
        assertEquals(CompassDirection.E, roverPosition.getFacing());

        roverPosition.move('R');
        assertEquals(CompassDirection.S, roverPosition.getFacing());

        roverPosition.move('R');
        assertEquals(CompassDirection.W, roverPosition.getFacing());

        roverPosition.move('R');
        assertEquals(CompassDirection.N, roverPosition.getFacing());
    }

    @Test
    @DisplayName("Returns correct direction when moved")
    void returnsCorrectDirectionWhenMoved() {
        RoverPosition roverPosition = new RoverPosition(0,0,CompassDirection.N);
        roverPosition.move('M');
        assertEquals(0, roverPosition.getX());
        assertEquals(1, roverPosition.getY());

        roverPosition.move('R'); // Face East
        roverPosition.move('M');
        assertEquals(1, roverPosition.getX());
        assertEquals(1, roverPosition.getY());

        roverPosition.move('R'); // Face South
        roverPosition.move('M');
        assertEquals(1, roverPosition.getX());
        assertEquals(0, roverPosition.getY());

        roverPosition.move('R'); // Face West
        roverPosition.move('M');
        assertEquals(0, roverPosition.getX());
        assertEquals(0, roverPosition.getY());

    }
}