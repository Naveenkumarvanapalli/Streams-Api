package Streams;

import java.util.stream.Stream;

public class Program_9_Distinct {
    public static void main(String[] args) {
        Stream.of("Apple", "Banana", "PineApple", "Guava", "Litchi", "Oranges", "Apple","PineApple", "Green Apple")
                .distinct()
                .forEach(System.out::println);
    }
}
