import org.junit.Test;
import problems.CountDiv;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 06/04/17.
 */
public class CountDivTest {

    @Test
    public void test() {

        int A = 6, B = 11, K = 2;
        int expected = 3;

        CountDiv o = new CountDiv();
        int result = o.solution(A, B, K);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {

        int A = 6, B = 12, K = 3;
        int expected = 3;

        CountDiv o = new CountDiv();
        int result = o.solution(A, B, K);

        assertEquals(expected, result);
    }

    @Test
    public void test_3() {

        int A = 5, B = 20, K = 5;
        int expected = 4;

        CountDiv o = new CountDiv();
        int result = o.solution(A, B, K);

        assertEquals(expected, result);
    }

    @Test
    public void test_4() {
        int A = 1, B = 1, K = 11;
        int expected = 0;

        CountDiv o = new CountDiv();
        int result = o.solution(A, B, K);

        assertEquals(expected, result);
    }

    @Test
    public void test_5() {
        int A = 11, B = 347, K = 17;
        int expected = 20;

        CountDiv o = new CountDiv();
        int result = o.solution(A, B, K);

        assertEquals(expected, result);
    }
}
