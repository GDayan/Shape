package repository.impl;

import entity.Rectangle;
import repository.Specification;

public class idSpecification implements Specification {

    private long id;

    public idSpecification(Long id) {
        this.id = id;
    }

    @Override
    public boolean specify(Rectangle rectangle) {
        boolean result = rectangle.getRectangleId() == id;
        return result;
    }
}{
}
