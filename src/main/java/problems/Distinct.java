package problems;

import java.util.TreeSet;

/**
 * Created by eduardocucharro on 10/04/17.
 */
public class Distinct {

    public int solution(int[] A) {
        //Encontrar o numero de elementos distintos

        TreeSet<Integer> tree = new TreeSet<Integer>();

        for(int i = 0; i < A.length; i++) {
            if(!tree.contains(A[i])) {
                tree.add(A[i]);
            }
        }

        return tree.size();
    }
}
