package org.example.InputParser;

import org.example.CompassDirection;
import org.example.Instruction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstructionParserTest {
    @Test
    @DisplayName("Returns error for invalid characters")
    void returnsErrorForInvalidCharacters(){
        String instruction="WLRM";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            InstructionParser.instructionParser(String.valueOf(Instruction.valueOf(instruction)));
        });

        //Assert expected, actual
        assertEquals(thrown.getMessage(),thrown.getMessage());
    }

    @Test
    @DisplayName("Returns error for lowercase characters")
    void returnsErrorForLowerCaseCharacters(){
        String instruction="lrM";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            InstructionParser.instructionParser(String.valueOf(Instruction.valueOf(instruction)));
        });

        //Assert expected, actual
        assertEquals(thrown.getMessage(),thrown.getMessage());
    }

    @Test
    @DisplayName("Returns corRect instruction when parsed")
    void returnsInstructionWhenParsed(){
        //Arrange
        String instruction ="LMRM";

        //Act
        List<Instruction> instructionList = InstructionParser.instructionParser(instruction);

        //Assert
        assertEquals(Instruction.L,instructionList.getFirst());
        assertEquals(Instruction.M,instructionList.get(1));
        assertEquals(Instruction.R,instructionList.get(2));
        assertEquals(Instruction.M,instructionList.getLast());
    }

    @Test
    @DisplayName("Returns an empty list when input string is empty")
    void returnsErrorWhenInputIsEmpty() {
        //Arrange
        String input = "";

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            InstructionParser.instructionParser(input);
        });

        // Assert expected, actual
        assertEquals("Enter a valid input", thrown.getMessage());
    }

    @Test
    @DisplayName("Returns an empty list when input string is null")
    void returnsErrorWhenInputIsNull() {
        //Arrange
        String input = null;

        //Act
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            InstructionParser.instructionParser(input);
        });

        // Assert expected, actual
        assertEquals("Enter a valid input", thrown.getMessage());
    }
}