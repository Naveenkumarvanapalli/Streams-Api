package Method_References;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumFeature = Integer::sum;
        Integer apply = sumFeature.apply(100, 500);
        System.out.println(apply);
    }
}
