package problems;


import java.util.TreeSet;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class OddOccurrences {
    public int solution(int[] A) {
        //O(N)

        TreeSet ss = new TreeSet();

        for (int i = 0; i < A.length; i++) {

            if (!ss.contains(A[i])) {
                ss.add(A[i]);
            } else {
                ss.remove(A[i]);
            }
        }

        return (Integer) ss.first();
    }
}
