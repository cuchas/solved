package recursion;

/**
 * Created by eduardocucharro on 29/03/17.
 */
public class Multiplication {
    public static int multiply(int a, int b) {
        if (b==1)
            return a;
        return a + multiply(a,b-1);
    }

    public static void main(String[] args) {
                System.out.println(multiply(2, 4));
    }
}
