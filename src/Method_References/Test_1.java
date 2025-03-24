package Method_References;

import java.io.PrintStream;
import java.util.function.*;

public class Test_1 {
    public static void main(String[] args) {
//        First Way
        String str = "Hello World with Method References.";
        Supplier<String> returnStr = str::toUpperCase;
        System.out.println(returnStr.get());

//        Second Way
        Function<String, String> resultStr = String::toUpperCase;
        System.out.println(resultStr.apply(str)  + " - From Function");

//      First Way
        Consumer<String> printStr = System.out::println;
        printStr.accept("PLease Print this from System.out");
//      Second Way
        Consumer<String> printStr1 = new PrintStream(System.out)::println;
        printStr.accept("PLease Print this from PrintStream");
//      Third Way
        BiConsumer<PrintStream, String> PrintStr2 = PrintStream::println;
        PrintStr2.accept(new PrintStream(System.out), "PLease Print this from PrintStream from Arbitrary Method.");
    }
}
