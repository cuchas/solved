package recursion;

/**
 * Created by eduardocucharro on 28/03/17.
 */
public class Factorial {

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n*factorial(n-1);
    }

    public static int tailRecursionFactorial(int n, int acummulator) {
        if(n == 0) return acummulator;
        return tailRecursionFactorial(n-1, n*acummulator);
    }

    public static void main(String[] a) {
        System.out.println(factorial(3));
        System.out.println(tailRecursionFactorial(3, 1));
    }
}
