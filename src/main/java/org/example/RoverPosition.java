package org.example;

public class RoverPosition {
    private int x;
    private int y;
    private CompassDirection facing;

    public RoverPosition(int x, int y, CompassDirection facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CompassDirection getFacing() {
        return facing;
    }

    public void setFacing(CompassDirection facing) {
        this.facing = facing;
    }

    public void move(char instruction){
        if(instruction == 'L'){
            turnLeft();
        } else if (instruction =='R') {
            turnRight();
        } else if (instruction == 'M') {
            move();
        }
    }

    private void turnLeft() {
        if (facing == CompassDirection.N) {
            facing = CompassDirection.W;
        } else if (facing == CompassDirection.W) {
            facing = CompassDirection.S;
        } else if (facing == CompassDirection.S) {
            facing = CompassDirection.E;
        } else if (facing == CompassDirection.E) {
            facing = CompassDirection.N;
        }
        }

        private void turnRight() {
            if (facing == CompassDirection.N) {
                facing = CompassDirection.E;
            } else if (facing == CompassDirection.E) {
                facing = CompassDirection.S;
            } else if (facing == CompassDirection.S) {
                facing = CompassDirection.W;
            } else if (facing == CompassDirection.W) {
                facing = CompassDirection.N;
            }
        }

    public void move(){
        if(facing == CompassDirection.N){
            y++;
        } else if (facing == CompassDirection.E) {
            x++;
        } else if (facing == CompassDirection.S) {
            y--;
        } else if (facing == CompassDirection.W) {
            x--;
        }

    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", facing=" + facing +
                '}';
    }
}
