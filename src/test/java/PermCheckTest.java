import org.junit.Test;
import problems.PermCheck;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class PermCheckTest {

    @Test
    public void test() {
        int[] A = new int[] { 4, 1, 3, 2 };

        int expected = 1;

        PermCheck o = new PermCheck();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        int[] A = new int[] { 4, 1, 3 };

        int expected = 0;

        PermCheck o = new PermCheck();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_3() {
        int[] A = new int[] { };

        int expected = 0;

        PermCheck o = new PermCheck();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_4() {
        int[] A = new int[] { 1 };

        int expected = 1;

        PermCheck o = new PermCheck();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_5() {
        int[] A = new int[] { 1, 2 };

        int expected = 1;

        PermCheck o = new PermCheck();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_6() {
        int[] A = new int[] { 1, 3 };

        int expected = 0;

        PermCheck o = new PermCheck();
        int result = o.solution(A);

        assertEquals(expected, result);
    }
}
