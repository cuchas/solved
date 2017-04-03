package sorting;

/**
 * Created by eduardocucharro on 31/03/17.
 */
public class CountingSortDemo {

    public static void main(String[] args) {
        int[] a = SortingUtil.generate();

        int[] sorted = new int[a.length];

        for(int i = 0; i < sorted.length; i++) {
            sorted[a[i]] += 1;
        }

        System.out.println("Unsorted Collection");
        printArray(a);

        System.out.println();
        System.out.println("Sorted Collection");
        for(int i = 0; i < sorted.length; i++) {
            if(sorted[i] >= 1) {
                System.out.print(i + " ");
            }
        }
    }

    private static void printArray(int[] n) {

        for(int x : n) {
            System.out.print(x + " ");
        }
    }
}
