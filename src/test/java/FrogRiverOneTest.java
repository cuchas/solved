import org.junit.Test;
import problems.FrogRiverOne;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class FrogRiverOneTest {

    @Test
    public void test() {
        int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };

        int expected = 6;

        FrogRiverOne o = new FrogRiverOne();
        int result = o.solution(A, 5);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };

        int expected = -1;

        FrogRiverOne o = new FrogRiverOne();
        int result = o.solution(A, 7);

        assertEquals(expected, result);
    }

    @Test
    public void test_3() {
        int[] A = new int[] { 2, 2, 2, 2, 2, 2 };

        int expected = -1;

        FrogRiverOne o = new FrogRiverOne();
        int result = o.solution(A, 2);

        assertEquals(expected, result);
    }

    @Test
    public void test_4() {
        int[] A = new int[] { 1, 2, 4, 2, 3, 6, 5 };

        int expected = 6;

        FrogRiverOne o = new FrogRiverOne();
        int result = o.solution(A, 5);

        assertEquals(expected, result);
    }
}
