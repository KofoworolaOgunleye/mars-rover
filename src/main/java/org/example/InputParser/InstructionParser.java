package org.example.InputParser;

import org.example.Instruction;

import java.util.ArrayList;
import java.util.List;

public class InstructionParser {
    public static List<Instruction> instructionParser(String instruction){
//        LRMM
        if (instruction == null || instruction.isEmpty()){
            throw new IllegalArgumentException("Enter a valid input");
        }

        List<Instruction> instructions= new ArrayList<>();
        for (char ch :instruction.toCharArray()){
            if(ch=='L'){
            instructions.add(Instruction.L);
            }
            if(ch == 'R'){
                instructions.add(Instruction.R);
            }
            if(ch == 'M'){
                instructions.add(Instruction.M);
            }
        }

        return instructions;
    }

}

