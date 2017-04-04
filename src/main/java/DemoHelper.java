import java.util.Random;


/**
 * Created by eduardocucharro on 03/04/17.
 */
public class DemoHelper {
    public static int[] generate() {
        int[] a = new int[10];
        Random r = new Random();

        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(200);
        }

        return a;
    }

    public static void printArray(int[] n) {

        for(int x : n) {
            System.out.print(x + " ");
        }
    }
}
