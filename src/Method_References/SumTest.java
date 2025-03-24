package Method_References;

public class SumTest {
    public static void main(String[] args) {
//        One Way
        Isum iSum = new Isum() {
            @Override
            public int sum(int value1, int value2) {
                return value1 + value2;
            }
        };
        int summed = iSum.sum(2, 2);
        System.out.println(summed);

//        Second Way
        Isum iSumLambda = (value1, value2) -> {
            return value1 + value2;
        };
        int summed1 = iSumLambda.sum(1, 3);
        System.out.println(summed1);

//        Third Way
        Isum isum = SumTest::addition;
        int summed2 = isum.sum(100, 300);
        System.out.println(summed2);

//        Fourth Way
        Isum iSum1 = SumTest::subtraction;
        int summed3 = iSum1.sum(100, 300);
        System.out.println(summed3);

//        Fifth Way, using the existing methods in java with Integer
        Isum iSum2 = Integer::sum;
        int summed4 = iSum2.sum(100, 500);
        System.out.println(summed4);

        int reverse = Integer.signum(500);
        System.out.println(reverse);
        
    }

    public static int addition(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtraction(int value1, int value2) {
        return value1 - value2;
    }

}
