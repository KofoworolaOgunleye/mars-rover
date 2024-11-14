package org.example.InputParser;

import org.example.PlateauSize;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlateauSizeParserTest {
    @Test
    @DisplayName("Returns individual number when string is passed")
    void returnsNumWhenStringIsPassed() {

        //Arrange
        String input = "5 5";

        //Act
        PlateauSize plateauSize =PlateauSizeParser.plateauSizeParser(input);

        //Assert expected, actual
        assertEquals(5,plateauSize.getWidth());
        assertEquals(5,plateauSize.getHeight());
    }

    @Test
    @DisplayName("Returns error message when input is not an integer")
    void returnsErrorWhenInputIsNotInteger() {

        //Arrange
        String input = "five 5";

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PlateauSizeParser.plateauSizeParser(input);
        });

        // Assert expected, actual
        assertEquals("Input must be numbers", thrown.getMessage());
    }

    @Test
    @DisplayName("Returns error message when input is negative")
    void returnsErrorWhenInputIsNegative() {

        //Arrange
        String input = "-5 -5";

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
           PlateauSizeParser.plateauSizeParser(input);
        });

        // Assert expected, actual
        assertEquals("Input cannot be negative", thrown.getMessage());
    }

    @Test
    @DisplayName("Returns error message when input is null")
    void returnsErrorWhenInputIsNull() {

        //Arrange
        String input = null;

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PlateauSizeParser.plateauSizeParser(input);
        });

        // Assert expected, actual
        assertEquals("Enter a valid input", thrown.getMessage());
    }

    @Test
    @DisplayName("Returns error message when input is empty")
    void returnsErrorWhenNoInputIsPassed() {

        //Arrange
        String input = "";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
         PlateauSizeParser.plateauSizeParser(input);
        });

        // Assert expected, actual
        assertEquals("Enter a valid input", thrown.getMessage());
    }

}