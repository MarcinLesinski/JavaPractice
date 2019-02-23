import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PairsAnalyzerTest
{
    private int[] input;
    private Integer expected;
    private PairsAnalyzer pairsAnalyzer = new PairsAnalyzer();

    public PairsAnalyzerTest(int[] input, Integer expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]
                {
                        {new int[]{1, 3, -3}, 6},
                        {new int[]{100}, 200},
                        {new int[]{0, 100}, 200}
                });
    }

    @Test
    public void soulution()
    {
        Integer actual = pairsAnalyzer.soulution(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}