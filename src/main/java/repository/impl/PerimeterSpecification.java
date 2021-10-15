package repository.impl;

import action.RectangleAction;
import entity.Rectangle;
import exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class PerimeterSpecification {
    private double minPerimeter;
    private double maxPerimeter;

    private static final Logger logger = LogManager.getLogger();

    public PerimeterSpecification(double minPerimeter, double maxPerimeter){
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
    }

    @Override
    public boolean specify(Rectangle rectangle) throws CustomException {
        RectangleAction action = new RectangleAction();
        double perimeter;
        try{
            perimeter = action.definePerimeter(rectangle);
        } catch (IOException e) { //TODO выдает ошибку
            throw new CustomException("Exception cannot be genereted ", e);
        }
    }
}
