package repository;

import entity.Rectangle;
import exception.CustomException;

public interface Specification {
    boolean specify(Rectangle rectangle) throws CustomException;
}
