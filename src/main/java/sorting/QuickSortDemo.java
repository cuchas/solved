package sorting;

import static sorting.SortingUtil.printArray;

/**
 * Created by eduardocucharro on 03/04/17.
 */
public class QuickSortDemo {

    public static void main(String[] args) {

        int[] a = SortingUtil.generate();

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
}
