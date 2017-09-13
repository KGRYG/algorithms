package Algorithms.PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static List<Integer> primeNumbers(int n) {
        if (n < 2) return null;
        List<Integer> primeList = new ArrayList<>(Arrays.asList(2));
        for (int i = 3; i < n; i++) {
            boolean valid = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) primeList.add(i);
        }
        return primeList;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
//        List<Integer> list = primeNumbers(100);
//        for (Integer in: list) {
//            System.out.print(in+", ");
//        }
        System.out.println(Math.sqrt(2));
    }
}
