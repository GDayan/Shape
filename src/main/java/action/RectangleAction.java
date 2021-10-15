package action;

import entity.Rectangle;

public class RectangleAction {
    public double defineSquare(Rectangle rectangle){
        double square;
        square = rectangle.getSide1() * rectangle.getSide2();
        return square;
    }
    public double definePerimeter(Rectangle rectangle){
        double perimeter;
        perimeter = 2 * (rectangle.getSide1() + rectangle.getSide2());
        return perimeter;
    }
    public boolean isRectangle(Rectangle rectangle){
        return (rectangle.getSide1() > rectangle.getSide2() || rectangle.getSide1() < rectangle.getSide2());
    }
    public String isSquare(Rectangle rectangle){
        return (rectangle.getSide1() == rectangle.getSide2() ? "it is square" : "it isn't square");
    }
}
