package sorting;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class InsertionSortDemo {

    public static void main(String[] args) {
        int[] vector = { 30, 15, 40, 1, 3, 4, 50, 2, 12 };

        printArray(vector);

        insertionSort(vector);

        printArray(vector);
    }

    public static void insertionSort(int[] vector) {
        //baseado na ordenação de cartas (deve iniciar ou começar ordenado)
        //pega um carta e compara com a selecionada
        //se ela for maior que a carta da sua mão, move a carta da mao pra trás
        //se ela não coloca ela no lugar

        //começa no 1 pq comparo ela com a anterior
        for(int i = 1; i < vector.length; i++) {
            int cartaAtual = vector[i];
            int j = i;

            //compara carta anterior com carta atual, se anterior for maior, passa ela pra frente e continua
            while(j > 0 && vector[j -1] > cartaAtual) {
                vector[j] = vector[j-1];
                j--;
            }
            vector[j] = cartaAtual;
        }
    }

    private static void printArray(int[] array) {

        System.out.println();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
