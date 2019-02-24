package CoinsReversalOptimizer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OptimizerTest
{
    private int[] input;
    private int expected;

    private Optimizer optimizer = new Optimizer();

    public OptimizerTest(int[] input, int expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]
                {
                        {new int[]{1, 0, 0, 1, 0, 0}, 2},
                        {new int[]{1, 0}, 1},
                        {new int[]{1, 0, 1, 1, 0, 0}, 3},
                        {new int[]{1, 0, 0, 0, 0, 0}, 1},
                        {new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1}, 4},
                });
    }

    @Test
    public void solution_correctData_shouldPass()
    {
        int actual = optimizer.optimize(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}