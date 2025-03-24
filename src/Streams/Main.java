package Streams;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer counter = 0;
        System.out.println("Hello world!");
        Supplier<String> supplier = new Supplier<String>() {
            private int counter;

            @Override
            public String get() {
                this.counter++;
                return "Hello Stream : - " + this.counter ;
            }
        };
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Stream<String> generated = Stream.generate(supplier);
        generated.limit(10).forEach(consumer);
//       Another Way
        Stream.iterate(0, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer++;
            }
        }).limit(20).forEach(System.out::println);
//    Another Way
        Stream.iterate(0, integer -> integer++).limit(30).forEach(System.out::println);
    }


}