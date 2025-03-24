package Streams;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program_4 {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,6,7,8,9,10};
//        First Way
        for(Integer num : input){
            if(num > 5)
                System.out.println(num);
        }
//        Second Way
        Stream<Integer> integerStream = Arrays.stream(input);
        Stream<Integer> filteredIntegerStream = integerStream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        });
        filteredIntegerStream.forEach(System.out::println);

//          Third Way
        Arrays.stream(input).filter(num -> num > 5).forEach(System.out::print);
//        Fourth Way for logging
        Arrays.stream(input)
                .peek(num -> System.out.println("Processing this Number :- " + num))
                .filter(num -> {
                    System.out.println("performing Conditional Check");
                    return num > 5;
                })
                .forEach(num -> {
                    System.out.println("Prong the value from ForLoop :- " + num);
                });
    }


}
