import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputSource {
    public static List<String> getInput() {
        String inputString = "ростелеком, ростелекомчик, пиво";
        List<String> inputList = new ArrayList<>(Arrays.asList(inputString.split(", ")));
        return inputList;
    }
}
