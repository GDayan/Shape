package reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exception.CustomException;

public class DataReader {
    private static final Logger logger = LogManager.getLogger();

    public List<String> readAll(String filePath) throws CustomException {
        List<String> lines;
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader))
        {
            lines = bufferedReader.lines()
                                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new CustomException("File doesn't exist ", e);
        }
        return lines;
    }
}
