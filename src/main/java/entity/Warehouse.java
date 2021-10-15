package entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Logger logger = LogManager.getLogger();
    private Map<Long, ShapeParameter> map;
    private static  Warehouse instance;

    public static Warehouse getInstance() {
        if (instance == null){
            logger.info("creating singleton warehouse");
            instance = new Warehouse();
        }
        return instance;
    }

    private Warehouse(){
        this.map = new HashMap<>();
    }

    public ShapeParameter get(Long id){
        return map.get(id);
    }

    public Map<Long, ShapeParameter> getMap(){
        return map.clone(); //TODO выдает ошибку
    }

    public ShapeParameter put(Long id, ShapeParameter value){
        return map.put(id, value);
    }

    public ShapeParameter remove(Long id){
        return map.remove(id);
    }
}
