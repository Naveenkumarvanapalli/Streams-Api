package Method_References;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class List_Test {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        BiConsumer<ArrayList<Integer>, Integer> consumer = ArrayList::add;
        consumer.accept(array, 1);
        consumer.accept(array, 2);
        consumer.accept(array, 3);
        array.forEach(System.out::println);
    }
}
