package Method_References;

public class PrintTest {
    public static void main(String[] args) {
        IPrint iPrint = PrintTest::print;
        iPrint.PrintData("Hello Method Reference");
    }

    //    First Way
//    public static void print(String s){
//     System.out.println(s);
//    }
//    I can have same method with different return type, this will work file.
//    Second Way
    public static String print(String s) {
        System.out.println(s);
        return "Hello" + s;
    }
}
