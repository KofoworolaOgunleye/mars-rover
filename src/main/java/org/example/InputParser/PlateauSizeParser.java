package org.example.InputParser;

import org.example.PlateauSize;

public class PlateauSizeParser {
    public static PlateauSize plateauSizeParser(String input){
        if (input == null || input.isEmpty()){
            throw new IllegalArgumentException("Enter a valid input");
        }

        try {
            String[] individualNumber = input.split(" ");
            int width = Integer.parseInt(individualNumber[0]);
            int height = Integer.parseInt(individualNumber[1]);

            if (width<0 || height<0){
                throw new IllegalArgumentException("Input cannot be negative");
            }

            return new PlateauSize(width, height);

        }catch (NumberFormatException e){
//            System.out.println("Input must be numbers");
            throw new IllegalArgumentException("Input must be numbers");
        }
    }
}
