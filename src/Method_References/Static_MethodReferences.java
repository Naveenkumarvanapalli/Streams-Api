package Method_References;

public class Static_MethodReferences {
    public static void main(String[] args) {
//        With Static method references
        IAddition iAddition = Static_MethodReferences::doAddition;
        int addition = iAddition.addition(10, 20);
        System.out.println("Addition Value :- " + addition);

//        Without Static method references
        Static_MethodReferences staticMethodReferencesInstance = new Static_MethodReferences();
        IAddition iSubtraction =staticMethodReferencesInstance::doSubtraction;
        int subtraction = iSubtraction.addition(10, 20);
        System.out.println("Subtraction Value :- " + subtraction);

//        Without Static method references Another Way
        IAddition iMultiplication = new Static_MethodReferences()::doMultiplication;
        int multiplication = iMultiplication.addition(10, 20);
        System.out.println("Multiplication Value :- " + multiplication);
    }
    static int doAddition(int i, int j){
        return i + j;
    }
    int doSubtraction(int i, int j){
        return i - j;
    }
    int doMultiplication(int i, int j){
        return i * j;
    }
}
