package problems;

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


        int result = -1;

        for(int j = 1; j < A.length; j++) {

            int sumBefore = 0;

            for(int i = j; i < A.length; i++) {

                int x = (A[i] + A[i - 1] + sumBefore) / (i + 1);

                if(x < sumBefore || result == -1) {
                    result = j - 1;
                } else {
                    sumBefore = x;
                }
            }
        }

        return result;
    }
}
