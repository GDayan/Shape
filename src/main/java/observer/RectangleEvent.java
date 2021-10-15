package observer;

import java.util.EventObject;

public class RectangleEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public RectangleEvent(Object source) {
        super(source);
    }
    @Override
    public Object getSource(){ //TODO если менять на Rectangle, то выдает ошибку
        return super.getSource();
    }
}
