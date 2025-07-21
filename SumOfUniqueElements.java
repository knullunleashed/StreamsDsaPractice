import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums){
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .map(e -> e.getKey())
            .mapToInt(Integer::intValue)
            .sum();
    }

    public static void main(String[] args) {
        int input1 [] = {1,2,3,2};
        int input2 [] = {1,1,1,1,1};
        int input3 [] = {1,2,3,4,5};

        System.out.println(sumOfUnique(input1));
        System.out.println(sumOfUnique(input2));
        System.out.println(sumOfUnique(input3));
    }
}
