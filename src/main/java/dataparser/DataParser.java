package dataparser;

import entity.Point;
import entity.Rectangle;
import validator.RectangleValidator;
import validator.ValueValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {
    private static final String REGEX_DELIMITER = "\\s++";

    public List<Rectangle> parseData(List<String> linespoint){
        List<Rectangle> rectangles = new ArrayList<>();
        RectangleValidator validator = new RectangleValidator();
        for(String line : linespoint){
            if(validator.isValidRectangleData(line)){
                List<Double> values = parseToDoubleArray(line);
                rectangles.add(new Rectangle(new Point(values.get(0), values.get(1)))); //TODO // выдает ошибку
            }
        }
        return rectangles;
    }

    public static List<Double> parseToDoubleArray(String line){
        List<String> strings = parseToStringArray(line);
        List<Double> values = new ArrayList<>();
        ValueValidator validator = new ValueValidator();
        for(String string : strings){
            if(validator.isDouble(string)){
                values.add(Double.parseDouble(string));
            }
        }
        return values;
    }
    public static List<String> parseToStringArray(String line){
        line = line.trim();
        List<String> strings = Arrays.asList(line.split(REGEX_DELIMITER));
        return strings;
    }
}
