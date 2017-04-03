package sorting;

import java.util.Random;

/**
 * Created by eduardocucharro on 31/03/17.
 */
public class CountingSortDemo {

    public static void main(String[] args) {
        int[] a = new int[200];
        Random r = new Random();

        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(200);
        }

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
