import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfCharactersInAString {
    public static void main(String[] args) {
        String str = "United Parcel Service";
        Arrays.stream(str.replaceAll(" ", "").toLowerCase().split(""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .forEach((key,value) -> {
                System.out.println(key+" "+value);
            });
    }   
}
