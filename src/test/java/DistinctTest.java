import org.junit.Test;
import problems.Distinct;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 10/04/17.
 */
public class DistinctTest {

    @Test
    public void test() {
        int[] a = new int[] { 2, 1, 1, 2, 3, 1 };

        int expected = 3;

        Distinct o = new Distinct();
        int result = o.solution(a);

        assertEquals(expected, result);
    }

}
