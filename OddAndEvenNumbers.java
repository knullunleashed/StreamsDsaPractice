import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        var numericList = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>>partitioningMap = numericList.stream()
                .collect(Collectors.partitioningBy(num -> num%2 == 0));

        List<Integer>evenList = partitioningMap.get(true);
        List<Integer>oddList = partitioningMap.get(false);

        System.out.println("Even numbers are :"+evenList);
        System.out.println("Odd numbers are :"+oddList);

        List<Integer>list = new ArrayList<>();
        list.addAll(oddList);
        list.addAll(evenList);

        System.out.println("combined result: "+list);
    }    
}
