package problems;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class FrogRiverOne {
    public int solution(int[] A, int X) {
        //Cada index do array representa um tempo
        //A[index] representa onde uma folha caiu
        //X representa
        int[] C = new int[X+1];
        int sum = 0;

        for(int i = 0; i < A.length; i++) {

            if(A[i] <= X) {
                if(C[A[i]] == 0) {
                    C[A[i]] = 1;
                    sum +=1;
                }

                if(sum == X) return i;
            }
        }

        return -1;
    }
}
