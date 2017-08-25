package Algorithms.DynamicProgramming;

public class Factorial {
    public int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    public int callFactorial(int n) {
        return efficientFactorial(1, n);
    }

    private int efficientFactorial(int accumulator, int n) {
        if (n == 1) return accumulator;
        
        return efficientFactorial(accumulator*n, n-1);
    }
}
