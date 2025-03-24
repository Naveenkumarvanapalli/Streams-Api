package Streams;

import java.util.stream.Stream;

public class Program_8_Skip {
    public static void main(String[] args) {
        Stream.of("Apple", "Banana", "PineApple", "Guava", "Litchi", "Oranges")
                .skip(2)
                .forEach(System.out::println);
    }
}
