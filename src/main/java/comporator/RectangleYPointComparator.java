package comporator;

import entity.Rectangle;

import java.util.Comparator;

public class RectangleYPointComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2){
        return Double.compare(o1.getStartingpoint().getY(), o2.getStartingpoint().getY());
    }
}
