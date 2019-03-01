package DicesRollOptimizer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class OptimizerTest
{
    private int[] input;
    private int expected;

    Optimizer optimizer = new Optimizer();

    public OptimizerTest(int[] input, int expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void optimize()
    {
        int actual = optimizer.optimize(this.input);
        assertEquals(this.expected, actual);

    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]
                {
                        {new int[]{}, 0},
                        {new int[]{1, 1, 2}, 1},
                        {new int[]{1, 1, 6}, 2},
                        {new int[]{1, 2, 3, 1}, 2},
                        {new int[]{2, 2, 5, 5}, 4}
                });
    }
}