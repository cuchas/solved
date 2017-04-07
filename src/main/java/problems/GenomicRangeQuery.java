package problems;

import java.util.Arrays;

/**
 * Created by eduardocucharro on 07/04/17.
 */
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {

        int[] results = new int[P.length];

        char[] chars = S.toCharArray();

        for(int i = 0; i < P.length; i++) {
            char c = chars[P[i]];
            char x = chars[Q[i]];

            int k = findValue(c);
            int j = findValue(x);

            if(k < j) {
                results[i] = k;
            } else {
                results[i] = j;
            }
        }

        return results;
    }

    private int findValue(char A) {
        char[] chars = new char[] { 'A', 'C', 'G', 'T' };
        int[] values = new int[] { 1, 2, 3, 4 };

        int i = Arrays.binarySearch(chars, A);

        if(i < 0) return -1;

        return values[i];
    }
}
