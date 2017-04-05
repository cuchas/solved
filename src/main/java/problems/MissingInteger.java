package problems;

import java.util.Arrays;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class MissingInteger {
    public int solution(int[] A) {

        Arrays.sort(A);

        int j = 1;

        int result = 0;

        for(int i = 0; i < A.length; i++) {

            result = Arrays.binarySearch(A, j);

            if(result < 0) return j;

            j++;
        }

        return result;
    }
}
