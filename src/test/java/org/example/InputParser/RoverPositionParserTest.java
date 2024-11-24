package org.example.InputParser;

import org.example.Rover;
import org.example.CompassDirection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoverPositionParserTest {
    @Test
    @DisplayName("Returns an Error when direction doesnt match compass direction, NESW ")
    void returnsErrorWhenDirectionDoesNotMatchCompassDirection(){
        //Arrange
        String position = "2 4 H";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RoverPositionParser.roverPositionParser(String.valueOf(CompassDirection.valueOf(position)));
        });

        //Assert expected, actual
        assertEquals(thrown.getMessage(),thrown.getMessage());
    }

    @Test
    @DisplayName("Returns individual character")
    void returnsIndividualCharacter(){
        //Arrange
        String position = "2 4 N";

        //Act
        Rover roverPosition = RoverPositionParser.roverPositionParser(position);


        //Assert expected, equal
        assertEquals(2, roverPosition.getPosition().getX());
        assertEquals(4,roverPosition.getPosition().getY());
        assertEquals(CompassDirection.N,roverPosition.getPosition().getFacing());
    }


    @Test
    @DisplayName("Returns Error when lowercase compass direction is passed")
    void returnsErrorWhenLowerCaseDirectionIsPassed(){
        //Arrange
        String position = "2 4 n";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RoverPositionParser.roverPositionParser(String.valueOf(CompassDirection.valueOf(position)));
        });

        //Assert expected, actual
        assertEquals(thrown.getMessage(),thrown.getMessage());
    }

    @Test
    @DisplayName("Returns Error when input is negative")
    void returnsErrorWhenInputIsNegative(){
        //Arrange
        String position = "2 -4 N";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RoverPositionParser.roverPositionParser(position);
        });

        //Assert expected, actual
        assertEquals("Input cannot be negative",thrown.getMessage());
    }

    @Test
    @DisplayName("Returns error message when input is null")
    void returnsErrorWhenInputIsNull() {

        //Arrange
        String position = null;

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RoverPositionParser.roverPositionParser(position);
        });

        // Assert expected, actual
        assertEquals("Enter a valid input", thrown.getMessage());
    }

    @Test
    @DisplayName("Returns error message when input is empty")
    void returnsErrorWhenNoInputIsPassed() {

        //Arrange
        String position = "";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RoverPositionParser.roverPositionParser(position);
        });

        // Assert expected, actual
        assertEquals("Enter a valid input", thrown.getMessage());
    }

}