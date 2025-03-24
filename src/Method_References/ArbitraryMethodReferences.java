package Method_References;

public class ArbitraryMethodReferences {
    public static void main(String[] args) {
        ISubtraction iSubtraction =ArbitraryMethodReferences::doSubtraction;
        int sub = iSubtraction.sub(new ArbitraryMethodReferences(), 100, 20);
        System.out.println(sub);
    }
    int doSubtraction(int i, int j){
        return i - j;
    }
}
