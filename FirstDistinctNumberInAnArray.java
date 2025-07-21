import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstDistinctNumberInAnArray {
    
    public static int findFirstUniqueNumber(int [] nums){
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .map(e -> e.getKey())
            .mapToInt(Integer::intValue)
            .findFirst()
            .orElse(-1);
    }

    public static void main(String[] args) {
        int [] input1 = {3, 3, 3, 4, 4, 5, 7, 8, 8};
        int [] input2 = {};
        System.out.println(findFirstUniqueNumber(input1));
        System.out.println(findFirstUniqueNumber(input2));
    }
}
