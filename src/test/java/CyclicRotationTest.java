import org.junit.Test;
import problems.CyclicRotation;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class CyclicRotationTest {

    @Test
    public void test() {
        int[] A = new int[] {3, 8, 9, 7, 6 };
        int rotation = 3;

        CyclicRotation o = new CyclicRotation();

        int[] result = o.solution(A, rotation);

        int[] expected = new int[] { 9, 7, 6, 3, 8 };
        assertArrayEquals(expected, result);
    }
}
