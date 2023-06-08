import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CalculationResult {
    private String categoryName;
    private float jaccardIndexUniqueChars;
    //private float jaccardIndexAllChars;
    @Override
    public String toString() {
        return "Имя категории: " + categoryName + ";   K: " + jaccardIndexUniqueChars + ".";
    }
}
