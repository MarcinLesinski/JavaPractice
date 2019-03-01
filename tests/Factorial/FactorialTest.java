package Factorial;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FactorialTest
{
    private int input;
    private int expected;

    private Factorial factorial = new Factorial();
    public FactorialTest(int input, int expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]
                {
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120}
                });
    }

    @Test
    public void factorial()
    {
        int actual = this.factorial.calc(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}