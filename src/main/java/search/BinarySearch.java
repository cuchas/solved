package search;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] dataSet = { -5, 12, 15, 20, 30, 72, 456 };

        int search = 456;
        int result = binarySearch(search, dataSet);

        if(result == -1) {
            System.out.println("Not found: " + search);
            return;
        }

        System.out.println("Found: " + search);
    }

    public static int binarySearch(int number, int[] array) {
        //Pego o total de itens e divido pela metade
        //verifico se o item do meio é maior, menor que o item buscado
        //se for menor pego a metade pra trás com base nele
        //se for maior pego a metade maior com base nele
        //se for diferente saio do loop e verifico se encontrei o resultado ou não

        int mid; //mid index
        int lid = 0; //lower index
        int hid = array.length; //high index

        while (lid <= hid) {

            mid = (lid + hid) / 2;

            if(array[mid] < number) {
                lid = mid + 1;
            } else if (array[mid] > number) {
                hid = mid - 1;
            } else {
                break;
            }
        }

        if(lid > hid) {
            return -1;
        }

        return number;
    }
}
