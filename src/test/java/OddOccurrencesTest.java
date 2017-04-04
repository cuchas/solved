import org.junit.Test;
import problems.OddOccurrences;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by eduardocucharro on 04/04/17.
 */
public class OddOccurrencesTest {

    @Test
    public void should_return_7() {
        int[] a = new int[] { 9, 3, 9, 3, 9, 7, 9 };

        OddOccurrences c = new OddOccurrences();
        int solution = c.solution(a);

        assertEquals(7, solution);
    }
}
