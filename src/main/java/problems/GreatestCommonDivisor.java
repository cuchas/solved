package problems;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        double n1 = 16;
        double n2 = 4;
        double divisor = gcd(n1, n2);

        System.out.println(String.format("GCD of %1$.2f and %2$.2f is %3$.2f", n1, n2, divisor));

    }

    //Euclid algorithm (GCD Greatest Commom Divisor
    //Algoritmo de Euclid máximo divisor comum
    public static double gcd(double n1, double n2) {
        double mod = n1 % n2;

        if (mod == 0) return n2;

        return gcd(n2, mod);
    }
}
