package SeasionsTemperatureAplitudeAnalyzer;

import CoinsReversalOptimizer.Optimizer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnalyzerTest
{
    private int[] input;
    private Season expected;

    private Analyzer analyzer = new Analyzer();

    public AnalyzerTest(int[] input, Season expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]
                {
                        {new int[]{8, 0, 1, 1, 2, 2, 3, 3}, Season.WINTER},
                        {new int[]{0, 0, 8, 0, 2, 2, 3 ,3}, Season.SPRING},
                        {new int[]{0, 0, 1, 1, 8, 0, 3, 3}, Season.SUMMER},
                        {new int[]{0, 0, 1, 1, 2, 2, 8 ,0}, Season.AUTUMN},
                        {new int[]{1, 100, 12, 34, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, Season.WINTER},
                });
    }

    @Test
    public void solution_correctData_shouldPass()
    {
        Season actual = analyzer.analyze(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}