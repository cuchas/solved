package sorting;

/**
 * Created by eduardocucharro on 29/03/17.
 */
public class MergeSort {

    public static void main(String[] args) {
        int a[] = new int[] { 4, 5, 6, 1, 2, 3 };

        printArray(a);

        sort(a, 0, a.length -1);

        printArray(a);
    }

    private static void printArray(int[] a) {
        int i = 0;

        System.out.println();

        while(i < a.length) {
            System.out.print(a[i] + ",");

            i++;
        }
    }

    public static void sort(int[] a, int start, int end) {
        //divide o array por 2 e crie vários arrays com dois elementos

        if (start < end) {
            int mid = (int) Math.floor((start+end)/2);
            sort(a, start, mid);
            sort(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] data, int start, int mid, int end) {
        //cria um novo array do tamanho dos dois arrays de comparação e compara cada um dos elementos

        int sizeOfLeft = mid-start+1;
        int sizeOfRight = end - mid;
        int[] left = new int[sizeOfLeft];
        int[] right = new int[sizeOfRight];
        for (int i = 0; i < sizeOfLeft; i++) {
            left[i] = data[start + i]; // be careful here
        }
        for (int j = 0; j < sizeOfRight; j++) {
            right[j] = data[mid + 1 + j]; // be careful
        }
        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
                data[k] = left[i];
                i++;
            } else {
                data[k] = right[j];
                j++;
            }
        }
    }
}
