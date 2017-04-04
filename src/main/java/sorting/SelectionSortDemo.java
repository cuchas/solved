package sorting;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class SelectionSortDemo {

    public static void main(String[] args) {

        int[] a = new int[] { 30, 15, 40, 1, 3, 4, 50, 2, 12 };

        printArray(a);

        selectionSort(a);

        printArray(a);
    }

    private static void printArray(int[] array) {

        System.out.println();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    //Ordena com base na posicão indicada, ordenando item a item do menor para o maior
    public static void selectionSort(int[] array) {

        for(int i = 0; i < array.length -1; i++) {

            for(int j = i + 1; j < array.length; j++) {

                int next = array[j];

                if(next < array[i]) {
                    int current = array[i];
                    array[i] = next;
                    array[j] = current;
                }
            }
        }
    }
}
