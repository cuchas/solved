import org.junit.Test;
import problems.PermMissingElem;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 05/04/17.
 */
public class PermMissingElemTest {
    @Test
    public void test() {
        int[] A = new int[] { 2, 3, 1, 5 };

        int expected = 4;

        PermMissingElem o = new PermMissingElem();
        int result = o.solution(A);

        assertEquals(expected, result);

    }
}
