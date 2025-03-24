package Method_References;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(8,10,12,2,5,3,9,7,8,10,46,23);
        Consumer<List<Integer>> consumerInter = Collections::sort;
        consumerInter.accept(integerList);
        System.out.println(integerList);

    }
}
