package Streams;

import java.util.Arrays;
import java.util.List;

public class primeNumber {
    public static boolean isPrime(int number){
        if(number <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
            return true;
    }

    public static void main(String[] args) {
        List<Integer>  num = Arrays.asList(1,2,3,4,5,6,9,8,7,45,12,12,15,16,49,90);
        boolean isPrimeNumber = num.stream()
                .distinct()
                .anyMatch(primeNumber::isPrime);
        System.out.println(isPrimeNumber);
    }
}
