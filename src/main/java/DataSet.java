import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataSet {
    private String categoryName;
    private List<String> keywords;
}
