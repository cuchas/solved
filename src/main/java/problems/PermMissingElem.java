package problems;

import java.util.Arrays;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class PermMissingElem {
    public int solution(int[] A) {

        Arrays.sort(A);

        int j = 1;

        for(int i = 0; i < A.length; i++) {

            if(A[i] != j)
                return j;

            j++;
        }

        return -1;
    }
}
