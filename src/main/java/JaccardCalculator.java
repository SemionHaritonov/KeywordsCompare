import java.util.*;

public class JaccardCalculator {
    public static float calculateIndexUniqueChars(String strOne, String strTwo) {
        Set<Character> setOne = stringToSet(strOne.toLowerCase());
        Set<Character> setTwo = stringToSet(strTwo.toLowerCase());
        Set<Character> common = new HashSet<>(setOne);
        common.retainAll(setTwo);
        float jaccardIndex = (float) common.size() / (setOne.size() + setTwo.size() - common.size());
        return Float.parseFloat(String.format(Locale.US, "%.2f", jaccardIndex));
    }

    public static float calculateIndexAllChars(String strOne, String strTwo) {
        char[] arrayOne = strOne.toLowerCase().toCharArray();
        char[] arrayTwo = strTwo.toLowerCase().toCharArray();
        int numberOfCommon = 0;
        boolean flag = false;
        for (int countOne = 0; countOne < arrayOne.length; countOne++) {
            for (int countTwo = 0; countTwo < arrayTwo.length; countTwo++) {
                flag = false;
                if (arrayOne[countOne] == arrayTwo[countTwo]) {
                    if (!flag) {
                        numberOfCommon++;
                        flag = true;
                    }
                }
            }
        }
        float jaccardIndex = (float) numberOfCommon / (arrayOne.length + arrayTwo.length - numberOfCommon);
        return jaccardIndex;
    }

    private static Set<Character> stringToSet(String str) {
        Set<Character> set = new HashSet<>();
        for (int counter = 0; counter < str.length(); counter++) {
            set.add(str.charAt(counter));
        }
        return set;
    }

    public static float maxIndexForListUniqueChars(String input, List<String> keywords) {
        List<Float> indexes = new ArrayList<>();
        keywords.forEach(t -> {
            indexes.add(calculateIndexUniqueChars(input, t));
        });
        return Collections.max(indexes);
    }

    public static float maxIndexForListAllChars(String input, List<String> keywords) {
        List<Float> indexes = new ArrayList<>();
        keywords.forEach(t -> {
            indexes.add(calculateIndexAllChars(input, t));
        });
        return Collections.max(indexes);
    }

    public static void main(String[] args) {
        System.out.println(stringToSet("ростелекои"));
        List<String> list = InputSource.getInput();
        System.out.println(maxIndexForListUniqueChars("ростелеком", list));
        System.out.println(maxIndexForListAllChars("ростелеком", list));
    }
}
