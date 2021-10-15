package observer.impl;

import action.RectangleAction;
import entity.Rectangle;
import entity.ShapeParameter;
import entity.Warehouse;
import exception.CustomException;
import observer.Observer;
import observer.RectangleEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class RectangleObserver implements Observer {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void updateArea(RectangleEvent rectangleEvent) throws CustomException {
        Rectangle rectangle = (Rectangle) rectangleEvent.getSource();
        long id = rectangle.getRectangleId();
        Warehouse warehouse = Warehouse.getInstance();
        ShapeParameter parameter = warehouse.get(id);
        RectangleAction action = new RectangleAction();
        try{
            double area = action.defineSquare(rectangle);
            parameter.setArea(area);
        } catch (IOException e) {
            throw new CustomException("Exception in updateArea method ", e);
        }
    }

    @Override
    public void updatePerimeter(RectangleEvent rectangleEvent) throws CustomException {
        Rectangle rectangle = (Rectangle) rectangleEvent.getSource();
        long id = rectangle.getRectangleId();
        Warehouse warehouse = Warehouse.getInstance();
        ShapeParameter parameter = warehouse.get(id);
        RectangleAction action = new RectangleAction();
        try{
            double perimeter = action.definePerimeter(rectangle);
            parameter.setPerimeter(perimeter);
        } catch (IOException e) {
            throw new CustomException("Exception in updatePerimeter method ", e);
        }
    }
}
