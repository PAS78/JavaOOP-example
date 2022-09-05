package ru.pas.Figure;

public class Rect extends Figure {

    float width, height;

    public Rect(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimetr() {
        return width * 2 + height * 2;
    }

}
