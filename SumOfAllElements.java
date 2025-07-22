import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfAllElements {
    public static void main(String[] args) {
        var numericList = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("Sum of all elements in an array :"+numericList.stream().reduce(0,Integer::sum));
        List<Integer> reversedList = new ArrayList<>(numericList);
        Collections.reverse(reversedList);
        System.out.println("reversed list: "+reversedList);
    }    
}
