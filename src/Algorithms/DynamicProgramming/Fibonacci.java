package Algorithms.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private Map<Integer, Integer> memoizeTable;

    public Fibonacci() {
        this.memoizeTable = new HashMap<>();
        this.memoizeTable.put(0,0);
        this.memoizeTable.put(1,1);
    }

    public int fibonacciDP(int n) {

        if (this.memoizeTable.containsKey(n)) return this.memoizeTable.get(n);

        memoizeTable.put(n-1, fibonacciDP(n-1));
        memoizeTable.put(n-2, fibonacciDP(n-2));

        int calcNum = memoizeTable.get(n-1) + memoizeTable.get(n-2);

        memoizeTable.put(n, calcNum);

        return calcNum;
    }

    public int naiveFibonacci (int n) {
        if (n <= 1) return n;
        return naiveFibonacci(n-1) + naiveFibonacci(n-2);
    }

    public boolean ifFibonacci(int n) {
        if (n <= 1) return true;
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        while (n3 < n) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3 == n;
    }

    private boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    public boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }


}
