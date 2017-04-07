package problems;

/**
 * Created by eduardocucharro on 06/04/17.
 */
public class PassingCars {

    public int solution(int[] A) {
        //Traverse do array
        //Subtraio o valor do proximo
        //Se der -1 somo um no acumulador
        //O(1)

        return firstSolution(A);
    }

    private int firstSolution(int[] A) {
        int result = 0;

        for(int i = 0; i < A.length; i++) {

            for(int j = i + 1; j < A.length;j++) {
                if(A[i] - A[j] == -1) {
                    result += 1;
                }
            }
        }

        if(result > 1000000000)
            return -1;

        return result;
    }
}
