package org.example;

public class PlateauSize {
    private int width;
    private int height;

    public PlateauSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PlateauSize{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
