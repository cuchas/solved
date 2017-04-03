package sorting;

import java.util.Random;

/**
 * Created by eduardocucharro on 03/04/17.
 */
public class QuickSortDemo {

    public static void main(String[] args) {

        int[] a = new int[200];
        Random r = new Random();

        for(int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(200);
        }

        System.out.println("Unsorted Collection");
        printArray(a);

        System.out.println();

        quicksort(a, 0, a.length-1);

        System.out.println("Sorted Collection");
        printArray(a);
        System.out.println();
    }

    public static void quicksort(int[] a, int start, int end) {

        if(start < end) {
            int partition = partition(a, start, end);
            //chamar sort de 0 até index do ultimo
            quicksort(a, start, partition-1);
            //chamar sort de dele até fim
            quicksort(a, partition+1, end);
        }
    }

    private static int partition(int[] a, int start, int end) {

        int pivot = a[end];
        int i = start;

        for(int j = start; j < end-1;j++) {
            if(a[j] <= pivot) {
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
                i++;
            }
        }

        int x = a[i];
        a[i] = pivot;
        a[end] = x;

        return i;
    }

    private static void printArray(int[] n) {

        for(int x : n) {
            System.out.print(x + " ");
        }
    }
}
