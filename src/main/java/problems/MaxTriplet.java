package problems;

/**
 * Created by eduardocucharro on 10/04/17.
 */
public class MaxTriplet {

    public int solution(int[] A) {

        //encontrar max triplet product
        //uma direção

        int result = 0;
        boolean r = true;

        for(int i = 0; i < A.length-2; i++) {

            int[] triplet = new int[3];
            int j = 0;
            int k = i+1;

            triplet[j] = A[i];

            while(j < 2 && k < A.length) {
                if(triplet[j] <= A[k]) {
                    triplet[++j] = A[k];
                }
                k++;
            }

            if(j < 2) {
                for(int l = 0; l < 3; l++) {
                    if(triplet[l] == 0) {
                        triplet[l] = 1;
                    }
                }
            }

            int triple = triplet[0] * triplet[1] * triplet[2];

            if(triple > result || r) {
                result = triple;
                r = false;
            }
        }

        return result;
    }
}
