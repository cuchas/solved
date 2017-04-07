import org.junit.Test;
import problems.PassingCars;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 06/04/17.
 */
public class PassingCarsTest {

    @Test
    public void test() {
        int[] a = new int[] { 0, 1, 0, 1, 1 };

        int expected = 5;

        PassingCars o = new PassingCars();
        int result = o.solution(a);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        int[] a = new int[] { 0, 1, 0, 0, 0 };

        int expected = 1;

        PassingCars o = new PassingCars();
        int result = o.solution(a);

        assertEquals(expected, result);
    }

    @Test
    public void test_3() {
        int[] a = new int[] { 0, 0, 0, 0, 0 };

        int expected = 0;

        PassingCars o = new PassingCars();
        int result = o.solution(a);

        assertEquals(expected, result);
    }

    @Test
    public void test_4() {
        int[] a = new int[] { 0, 0, 0, 0, 1 };

        int expected = 4;

        PassingCars o = new PassingCars();
        int result = o.solution(a);

        assertEquals(expected, result);
    }
}
