package problems;

import java.util.Arrays;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class PermCheck {

    public int solution(int[] A) {

        //todos os elementos da sequencia devem estar no array
        //se todos estiverem retorno 1
        //se não 0
        //O(n)

        if(A.length == 0) return 0;

        if(A.length > 1) {
            Arrays.sort(A);
        }

        int j = 1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] != j) return 0;
            j++;
        }

        return 1;
    }
}
