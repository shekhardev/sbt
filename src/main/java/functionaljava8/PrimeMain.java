package functionaljava8;

import java.util.stream.IntStream;

public class PrimeMain {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }

    private static boolean isPrime(final int number) {
        //Imparative style
//        for (int i=2; i<number;i++){
//            if (number % i ==0) return false;
//        }
        //Declative Style
        return number >1 &&
                IntStream.range(2,number)
                        .noneMatch(index ->number % index ==0);

    }
}
