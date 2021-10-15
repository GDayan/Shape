package entity;

import java.util.ArrayList;
import java.util.Observable;
import observer.Observer;
import generator.IdGenerator;
import observer.RectangleEvent;

public class Rectangle implements Observable {
    private long rectangleId;
    private Point startingpoint;
    private double side1;
    private double side2;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Rectangle(Point startingpoint, double side1, double side2){
    }

    public rectangle(Point startingpoint, double side1, double side2){
        IdGenerator generetor = new IdGenerator();
        this.rectangleId = generetor.generatorID();
        this.startingpoint = startingpoint;
        this.side1 = side1;
        this.side2 = side2;
    }

    public long getRectangleId() {
        return rectangleId;
    }

    public void setRectangleId(long rectangleId) {
        this.rectangleId = rectangleId;
    }

    public Point getStartingpoint() {
        return startingpoint;
    }

    public void setStartingpoint(Point startingpoint) {
        this.startingpoint = startingpoint;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public String toString(){

        return "Rectangle{" + "rectangleId=" + rectangleId + ", startingpoint=" + startingpoint + ", side1=" + side1 + ", side2=" + side2 +"}";
    }

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        RectangleEvent event = new RectangleEvent(this);
        if(!observers.isEmpty()){
            for(Observer observer : observers){
                observer.updateArea(event);
                observer.updatePerimeter(event);
            }
        }
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = (int)(prime * result + Double.valueOf(rectangleId));
        result = (int) (prime * result+ Double.valueOf(startingpoint)); //TODO //выдает ошибку
        result = (int)(prime * result + Double.valueOf(side1));
        result = (int)(prime * result + Double.valueOf(side2));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangleId == rectangle.rectangleId && Double.compare(rectangle.side1, side1) == 0 && Double.compare(rectangle.side2, side2) == 0 && startingpoint.equals(rectangle.startingpoint);
    }
}
