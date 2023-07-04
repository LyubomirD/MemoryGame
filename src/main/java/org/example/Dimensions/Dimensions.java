package org.example.Dimensions;

public class Dimensions implements DimensionProvider{

    private final int width;
    private final int height;

    public Dimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
