package sorting;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] vector = { 30, 15, 40, 1, 3, 4, 50, 2, 12 };

        printArray(vector);

        bubbleSort(vector);

        printArray(vector);
    }

    //Bubble sort O(nˆ2)
    //Ordena asc, com todos com todos passando o maior para a posicao da frente
    public static void bubbleSort(int[] array) {

        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array.length - i; j++) {

                if(j < array.length -1) {

                    int a = array[j];
                    int b = array[j + 1];

                    if(b < a) {
                        array[j] = b;
                        array[j + 1] = a;
                    }
                }

            }
        }
    }

    private static void printArray(int[] array) {

        System.out.println();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
