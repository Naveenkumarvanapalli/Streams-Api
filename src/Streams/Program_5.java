package Streams;

import java.util.Arrays;
import java.util.List;

public class Program_5 {
    public static void main(String[] args) {
        Integer[] numbers = {12,1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numbers)
                .filter(num -> num >= 3)
                .map(num -> {
                    return switch (num) {
                        case 1 -> "One";
                        case 2 -> "Two";
                        case 3 -> "Three";
                        case 4 -> "Four";
                        case 5 -> "Five";
                        case 6 -> "Six";
                        case 7 -> "Seven";
                        case 8 -> "Eight";
                        case 9 -> "Nine";
                        case 10 -> "Ten";
                        default -> "Number in word is not available - " + num;
                    };

                })
                .forEach(System.out::println);

        List<String> stringList = Arrays.stream(numbers)
                .filter(num -> num >= 3)
                .map(num -> {
                    return switch (num) {
                        case 1 -> "One";
                        case 2 -> "Two";
                        case 3 -> "Three";
                        case 4 -> "Four";
                        case 5 -> "Five";
                        case 6 -> "Six";
                        case 7 -> "Seven";
                        case 8 -> "Eight";
                        case 9 -> "Nine";
                        case 10 -> "Ten";
                        default -> "Number in word is not available - " + num;
                    };

                })
                .toList();
        stringList.forEach(System.out::print);
        System.out.println(stringList.stream().count());
    }
}
