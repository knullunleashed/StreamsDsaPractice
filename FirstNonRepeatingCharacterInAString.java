import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInAString {
    public static char firstNonRepeatingCharacter(String word){
        return Arrays.stream(word.split(""))
            .filter(e -> !e.isEmpty())
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .map(e -> e.getKey())
            .map(e -> e.charAt(0))
            .findFirst()
            .orElse('-');
            
    }
    
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("swiss"));
        System.out.println(firstNonRepeatingCharacter("aabbcc"));
        System.out.println(firstNonRepeatingCharacter("racecar"));
        System.out.println(firstNonRepeatingCharacter(""));
    }
}
