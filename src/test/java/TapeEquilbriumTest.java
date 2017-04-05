import org.junit.Test;
import problems.TapeEquilibrium;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class TapeEquilbriumTest {

    @Test
    public void test() {
        int[] A = new int[] { 3, 1, 2, 4, 3 };

        int expected = 1;

        TapeEquilibrium o = new TapeEquilibrium();
        int result = o.solution(A);

        assertEquals(expected, result);
    }


    @Test
    public void test_2() {
        int[] A = new int[] { 1, 1, 1, 1, 1 };

        int expected = 1;

        TapeEquilibrium o = new TapeEquilibrium();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_3() {
        int[] A = new int[] { 1, 1 };

        int expected = 0;

        TapeEquilibrium o = new TapeEquilibrium();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

}
