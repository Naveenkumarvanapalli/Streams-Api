package Method_References;

import java.util.function.BiFunction;

public class ConcatTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        BiFunction<String, String, String> testConcat = String::concat;
        testConcat.apply(str1, str2);
        System.out.println(str3 + " With Method Reference");
    }
}
