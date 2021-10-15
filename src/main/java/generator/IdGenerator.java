package generator;

public class IdGenerator {
    private static final long MIN = 1;
    private static final long MAX = 100000;
    private  static long counter;
    public IdGenerator(){
    }
    public static long generatorID(){
        ++counter;
        if(MIN + counter >= MAX){
            counter = 0;
        }
        long id = counter;
        return id;

    }
    public static void setID(long id){
        counter = id;
    }
}
