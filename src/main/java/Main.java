import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> inputList = InputSource.getInput();
        inputList.forEach(x -> {
            List<CalculationResult> results = new ArrayList<>();
            DataSource.getDataSets().forEach(t -> {
                CalculationResult result = new CalculationResult();
                result.setCategoryName(t.getCategoryName());
                result.setJaccardIndexUniqueChars(JaccardCalculator.maxIndexForListUniqueChars(x, t.getKeywords()));
                results.add(result);
            });
            System.out.println("Результат для: " + x);
            results.stream()
                    .filter(t -> t.getJaccardIndexUniqueChars() > 0.5)
                    .sorted((t, v) -> Float.compare(t.getJaccardIndexUniqueChars(), v.getJaccardIndexUniqueChars()))
                    .forEach(System.out::println);
            System.out.println();
        });

    }
}
