package org.example;

public class Rover {
    private Position position;

    public Rover(int x, int y, CompassDirection facing) {
        this.position = new Position(x, y, facing);
    }

    public Position getPosition() {
        return position;
    }

    public void move(char instruction) {
        position.move(instruction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                '}';
    }
}
