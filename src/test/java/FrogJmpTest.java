import org.junit.Test;
import problems.FrogJmp;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class FrogJmpTest {
    @Test
    public void test() {
        int X = 10;
        int Y = 85;
        int D = 30;

        int expected = 3;

        FrogJmp o = new FrogJmp();

        int result = o.solution(X, Y, D);

        assertEquals(expected, result);
    }

    @Test
    public void test_1() {
        int X = 1;
        int Y = 1;
        int D = 3;

        int expected = 0;

        FrogJmp o = new FrogJmp();

        int result = o.solution(X, Y, D);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        int X = 1;
        int Y = 2;
        int D = 3;

        int expected = 1;

        FrogJmp o = new FrogJmp();

        int result = o.solution(X, Y, D);

        assertEquals(expected, result);
    }
}
