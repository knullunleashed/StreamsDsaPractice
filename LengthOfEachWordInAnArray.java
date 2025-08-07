import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LengthOfEachWordInAnArray {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "pineapple", "apple", "orange", "orange", "melon");
        fruits.stream()
            .distinct()
            .collect(Collectors.toMap(Function.identity(), String::length))
            .forEach((key, value) -> {
                System.out.println(key+" -> "+value);
            });
    }    
}
