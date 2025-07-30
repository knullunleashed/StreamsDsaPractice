import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMaxElementAftertheMinElement {
    public static void main(String[] args) {
        int[] numbers = {9, 10, 8, 7, 12, 3, 5, 4, 6};

        //with streams
        int minIndex = IntStream.range(0, numbers.length)
            .reduce((i, j) -> numbers[i] < numbers[j] ? i : j)
            .orElse(-1);

        int maxAfterMin = (minIndex + 1 < numbers.length)
            ? Arrays.stream(numbers, minIndex + 1, numbers.length).max().orElse(-1)
            : -1;

        System.out.println(maxAfterMin);

        /* Wrong Logic */
        // int minimumElement = IntStream.of(numbers).min().getAsInt();
        // int maximumAfterMinimumElement = IntStream.of(numbers).skip(minimumElement).max().getAsInt();
        // System.out.println(maximumAfterMinimumElement);

        //Without Stream

        int minElement = Integer.MAX_VALUE;
        for (int i : numbers) {
            if(i < minElement){
                minElement = i;
            }
        }
 
        int maximumAfterMin = 0;
        boolean foundMin = false;
        for (int i : numbers) {

            if(foundMin){
                if(i > maximumAfterMin){
                    maximumAfterMin = i;
                } 
            }

            if(i == minElement && !foundMin){
                foundMin = true;
            }
            
        }

        System.out.println(maximumAfterMin);
        
    }    
}
