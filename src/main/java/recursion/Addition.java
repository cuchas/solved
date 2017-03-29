package recursion;

/**
 * Created by eduardocucharro on 29/03/17.
 */
public class Addition {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }

    public static int add(int a, int b) {

        if(b == 0) return a;

        System.out.println(String.format("level %d %d", a, b));

        return add(a+1, b-1);
    }
}
