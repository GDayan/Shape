package validator;

import dataparser.DataParser;

import java.util.List;

public class RectangleValidator {
    private static final int NUMBER_RECTANGLE_ARGUMENTS = 4;

    public boolean isValidRectangleData(String data)
    {
        boolean result = true;
        ValueValidator validator = new ValueValidator();
        List<String> values = DataParser.parseToStringArray(data);
        if(values.size() > NUMBER_RECTANGLE_ARGUMENTS)
        {
            for(String string : values)
            {
                if(!validator.isDouble(string)){
                    result = false;
                }
            }
        } else
            result = false;
        return result;
    }
}
