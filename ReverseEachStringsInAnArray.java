import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachStringsInAnArray {
    public static void main(String[] args) {
        var names = List.of("Alice", "Ruby", "Michael", "Alex", "Benny", "Benjamin");
        var reversedList = names.stream()
            .map(e -> new StringBuilder(e.toString().toLowerCase()).reverse().toString())
            .collect(Collectors.toList());

        reversedList.forEach(System.out::println);
    }    
}
