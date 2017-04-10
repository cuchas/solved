import org.junit.Test;
import problems.MaxTriplet;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 10/04/17.
 */
public class MaxTripletTest {

    @Test
    public void test() {
        int[] a = new int[] { -3, 1, 2, -2, 5, 6 };

        int expected = 60;

        MaxTriplet o = new MaxTriplet();
        int result = o.solution(a);

        assertEquals(expected, result);
    }

    @Test
    public void test_2() {
        int[] a = new int[] { 10, 10, 10};

        int expected = 1000;

        MaxTriplet o = new MaxTriplet();
        int result = o.solution(a);

        assertEquals(expected, result);
    }
}
