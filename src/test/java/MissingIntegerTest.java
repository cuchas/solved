import org.junit.Test;
import problems.MissingInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class MissingIntegerTest {

    @Test
    public void test() {
        int[] A = new int[] { 1, 3, 6, 4, 1, 2 };

        int expected = 5;

        MissingInteger o = new MissingInteger();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        int[] A = new int[] { 1, 2 };

        int expected = 1;

        MissingInteger o = new MissingInteger();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_3() {
        int[] A = new int[] {  };

        int expected = 0;

        MissingInteger o = new MissingInteger();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_4() {
        int[] A = new int[] { 2, 4, 5, 9, 6 };

        int expected = 1;

        MissingInteger o = new MissingInteger();
        int result = o.solution(A);

        assertEquals(expected, result);
    }

    @Test
    public void test_6() {
        int[] A = new int[] { 5 };

        int expected = 1;

        MissingInteger o = new MissingInteger();
        int result = o.solution(A);

        assertEquals(expected, result);
    }
}
