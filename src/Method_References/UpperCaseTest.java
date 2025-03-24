package Method_References;

public class UpperCaseTest {
    public static void main(String[] args) {
        IUpperCase iUpperCase = new UpperCaseTest() ::convert;
        String helloWorld = iUpperCase.convertUpperCase("Hello World");
        System.out.println(helloWorld);
    }
    String convert(String s){
        return s.toUpperCase();
    }
}
