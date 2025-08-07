import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceOfStringInAnArray {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "pineapple", "apple", "orange", "orange", "melon");
        fruits.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .forEach((key, value) -> {
                System.out.println(key+" -> "+value);
            });
    }
}
