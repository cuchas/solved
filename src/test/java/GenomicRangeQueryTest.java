import org.junit.Test;
import problems.GenomicRangeQuery;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by eduardocucharro on 07/04/17.
 */
public class GenomicRangeQueryTest {

    @Test
    public void test() {
        //Encontrar o menor valor entre as sequencias das duas consultas P, Q

        int[] P = new int[] { 2, 5, 0 };
        int[] Q = new int[] { 4, 5, 6 };
        String S = "CAGCCTA";

        int[] expected = new int[] { 2, 4, 1 };

        GenomicRangeQuery o = new GenomicRangeQuery();
        int[] result = o.solution(S, P, Q);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test_2() {
        //Encontrar o menor valor entre as sequencias das duas consultas P, Q

        int[] P = new int[] { 0, 0 };
        int[] Q = new int[] { 0, 0 };
        String S = "CAGCCTA";

        int[] expected = new int[] { 2, 2 };

        GenomicRangeQuery o = new GenomicRangeQuery();
        int[] result = o.solution(S, P, Q);

        assertArrayEquals(expected, result);
    }

}
