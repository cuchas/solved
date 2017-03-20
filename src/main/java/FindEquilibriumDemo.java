/**
 * Created by eduardocucharro on 20/03/17.
 */
public class FindEquilibriumDemo {

    public static void main(String[] args) {
        int[] a = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};

        System.out.println(findEquilibrium(a));
    }

    public static int findEquilibrium(int[] A) {

        for (int i = 1; i < A.length; i++) {

            int x = 0;
            int y = 0;

            int j = i;
            int k = i;

            while (j > 0) {
                x += A[j - 1];
                j--;
            }

            while (k < A.length - 1) {
                y += A[k + 1];
                k++;
            }

            if (x == y) {
                return i;
            }
        }


        return -1;

    }
}
