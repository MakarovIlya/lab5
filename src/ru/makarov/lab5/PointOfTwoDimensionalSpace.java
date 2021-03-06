package ru.makarov.lab5;

public class PointOfTwoDimensionalSpace extends Point {

    private double x;
    private double y;

    public PointOfTwoDimensionalSpace(int numberOfSpaces, double x, double y) {
        setName("Точка двумерного пространства");
        setNumberOfSpaces(numberOfSpaces);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  параметры: (" + x + "," + y + ")" + "кол-во параметров: " + this.numberOfVariables()+", дата и время создания: "+this.number()+"."+this.month()+"."+this.year()+" "+this.hour()+":"+this.minutes();
    }

    @Override
    public int numberOfVariables() {
        return numberOfSpaces;
    }

    @Override
    public boolean isLocateAxis() {
        return y == 0;
    }

    @Override
    public void summet() {
        this.x = -x;
        this.y = -y;

    }

    @Override
    public void transfer(Vektor p) {
        this.x += p.x1 - p.x0;
        this.y += p.y1 - p.y1;
    }

    @Override
    public int number() {
        return 10;
    }

    @Override
    public int month() {
        return 10;
    }

    @Override
    public int year() {
        return 2012;
    }

    @Override
    public int hour() {
        return 21;
    }

    @Override
    public int minutes() {
        return 30;
    }
}
