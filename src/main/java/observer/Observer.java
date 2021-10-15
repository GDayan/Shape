package observer;

import entity.Rectangle;
import exception.CustomException;

public interface Observer {
    void updateArea(RectangleEvent rectangleEvent) throws CustomException;
    void updatePerimeter(RectangleEvent rectangleEvent) throws CustomException;
}
