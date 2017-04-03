package sorting;

/**
 * Created by eduardocucharro on 17/03/17.
 */
public class InsertionSorter<T> {
    public void sort(Comparable<T>[] items) {

        for(int i = 1; i < items.length; i++) {
            int j = i;
            Comparable<T> current = items[i];

            while(j > 0 && items[j -1].compareTo(((T)current)) > 0) {
                items[j] = items[j-1];
                j--;
            }

            items[j] = current;
        }
    }
}
