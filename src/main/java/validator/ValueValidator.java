package validator;

import java.util.regex.Pattern;

public class ValueValidator {
    private static final String REGEX_DOUBLE = "\\d+";
    public boolean isDouble(String value){
        return Pattern.matches(REGEX_DOUBLE, value);
    }

}
