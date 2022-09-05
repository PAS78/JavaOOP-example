package ru.pas.Figure;

abstract class Figure {

    float x, y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Абстрактные методы всегда без реализации
    public abstract float getArea();
    public abstract float getPerimetr();

}
