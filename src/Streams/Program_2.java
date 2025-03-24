package Streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Program_2 {
    public static void main(String[] args) {
        Stream<Integer> streamOfIntegers = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Consumer<Integer> consumer = integer -> {
            System.out.print("Result : -");
            System.out.println(integer);
        };
        streamOfIntegers.forEach(consumer);
//        Another Way
        Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).forEach(num -> System.out.println(num));
//        Another Way
        Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).forEach(System.out::println);
    }
}
