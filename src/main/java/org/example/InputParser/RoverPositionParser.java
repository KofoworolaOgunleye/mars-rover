package org.example.InputParser;

import org.example.CompassDirection;
import org.example.RoverPosition;

public class RoverPositionParser {
    public  static RoverPosition roverPositionParser(String position){
        if (position == null || position.isEmpty()){
            throw new IllegalArgumentException("Enter a valid input");
        }

        String[] individualCharacter = position.split(" ");
        int x = Integer.parseInt(individualCharacter[0]);
        int y =Integer.parseInt(individualCharacter[1]);
        CompassDirection facing = CompassDirection.valueOf(individualCharacter[2]);

        if (x<0 || y<0){
            throw new IllegalArgumentException("Input cannot be negative");
        }
        return new RoverPosition(x,y,facing);
    }
}
