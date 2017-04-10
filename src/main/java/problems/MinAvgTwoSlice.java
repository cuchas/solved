package problems;

import java.util.Arrays;

/**
 * Created by eduardocucharro on 07/04/17.
 */
public class MinAvgTwoSlice {

    public int solution(int[] A) {
        //O(N)
        //somo todos os elements
        //uso dois acumuladores + result
        //venho de tras pra frente
        //subtraio o valor do ultimo e vejo o valor
        //se for menor que o acumulador
        //guardo i
        //senao somo o valor novamente
        //e continuo

        int index = 0;
        float before = -1;

        for(int i = 1; i < A.length-1; i++) {

            float a = A[i - 1];
            float b = A[i];
            float c = A[i + 1];

            float pair = (a + b) / 2;
            float three = (a + b + c) / 3;
            float nextPair = (b + c) / 2;

            if(pair < before || before == -1) {
                before = pair;
                index = i - 1;
            }

            if(nextPair < before || before == -1) {
                before = nextPair;
                index = i;
            }

            if(three < before || before == -1) {
                before = three;
                index = i - 1;
            }
        }

        return index;
    }
}
