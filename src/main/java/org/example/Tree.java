package org.example;

public class Tree {
    private int height;
    private int width;
    private String color;
    private TreeType type;

    public Tree( TreeType type ) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public TreeType getType() {
        return type;
    }

    public void setHeight( int height ) {
        this.height = height;
    }

    public void setWidth( int width ) {
        this.width = width;
    }

    public void setColor( String color ) {
        this.color = color;
    }
}
