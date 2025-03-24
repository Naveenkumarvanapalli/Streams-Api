package Method_References;

import java.util.Objects;
import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        BiPredicate<String, String> checkIfTwoStringsAreEqual = Objects::equals;
        boolean test = checkIfTwoStringsAreEqual.test("Apple", "Apples");
        System.out.println(test);
    }
}
