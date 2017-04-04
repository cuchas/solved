package search;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class LinearSearchDemo {

    public static void main(String[] args) {
        int i, src = 72;
        int[] x = { 20, 15, 12, 30, -5, 72, 456 };

        for (i = 0; i <= x.length - 1; i++) {
            if (x[i] == src) {
                System.out.println("Found " + src);
                return;
            }
        }

        System.out.println("Not Found " + src);
    }
}
