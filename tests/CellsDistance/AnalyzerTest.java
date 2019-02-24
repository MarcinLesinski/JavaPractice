package CellsDistance;

import CellsDistance.Analyzer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AnalyzerTest
{
    private int[] input;
    private Integer expected;
    private Analyzer analyzer = new Analyzer();

    public AnalyzerTest(int[] input, Integer expected)
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
        Integer actual = analyzer.analyze(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}