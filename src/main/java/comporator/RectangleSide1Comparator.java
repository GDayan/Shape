package comporator;

import entity.Rectangle;
import java.util.Comparator;
public class RectangleSide1Comparator implements Comparator<Rectangle>{
    @Override
    public int compare(Rectangle o1, Rectangle o2){
        return Double.compare(o1.getSide1(), o2.getSide1());
    }
}
