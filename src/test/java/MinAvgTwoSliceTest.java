import org.junit.Test;
import problems.MinAvgTwoSlice;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardocucharro on 07/04/17.
 */
public class MinAvgTwoSliceTest {

    @Test
    public void test() {
        //Encontrar a posicao onde começar a menor fatia
        //1 Fatia são a soma dos elements da fatia dividido pela quantidade dos elements

        int[] A = new int[] { 4, 2, 2, 5, 1, 5, 8 };

        int expected = 1;

        MinAvgTwoSlice o = new MinAvgTwoSlice();
        int result = o.solution(A);

        assertEquals(expected, result);
    }
}
