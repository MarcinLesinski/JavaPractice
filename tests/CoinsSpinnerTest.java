import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CoinsSpinnerTest
{
    private int[] input;
    private int expected;

    private CoinsSpinner coinsSpinner = new CoinsSpinner();

    public CoinsSpinnerTest(int[] input, int expected)
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
        int actual = coinsSpinner.solution(this.input);
        Assert.assertEquals(this.expected, actual);
    }

    /*

     wygląda na to że testy muszą być w odseparowanych klasach
    @Test(expected = AssertionError.class)
    public void solution_wrongData_shouldThrowAssert()
    {
        int[] data = new int[]{1, 0, 8, 0};
        coinsSpinner.solution(data);
    }

    */
}