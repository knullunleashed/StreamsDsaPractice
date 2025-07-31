/*
 * 
 * string1= "Ups parcel service delivery Service.
 * String2=" united parcel delivery system parcel service"
 * Have the string1 as base get the common words from string2 if the string 2 is having 2 parcel the output should be 
 * Parcel - 2
 * Service - 1
 * Delivery - 1
 * 
 * 
 */

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFreqOfWordsBasedOnTwoStrings {
    public static void main(String[] args) {
        String firstString = "Ups parcel service delivery Service";
        String secondString = " united parcel delivery system parcel service";

        var words = Stream.of(firstString.toLowerCase().split(" "))
            .collect(Collectors.toSet());

        Stream.of(secondString.trim().toLowerCase().split(" "))
            .filter(words::contains)
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
            .forEach((key,value) -> {
                System.out.println(key+" "+value);;
            });
    }    
}
