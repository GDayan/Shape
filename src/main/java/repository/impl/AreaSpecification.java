package repository.impl;

import action.RectangleAction;
import entity.Rectangle;
import exception.CustomException;
import repository.Specification;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class AreaSpecification implements Specification {

    private final static Logger logger = LogManager.getLogger();

    double minArea;
    double maxArea;

    public AreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    @Override
    public boolean specify(Rectangle rectangle) throws CustomException {
        RectangleAction action = new RectangleAction();
        double surfaceArea = 0;
        try {
            surfaceArea = action.defineSquare(rectangle);
        } catch (IOException e) { //TODO выдает ошибку
            throw new CustomException("Exception cannot be genereted ", e);
        }
    }
}
