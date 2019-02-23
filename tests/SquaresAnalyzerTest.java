import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SquaresAnalyzerTest
{
    private Integer to;
    private Integer from;
    private Integer expected;
    private SquaresAnalyzer squaresAnalyzer = new SquaresAnalyzer();

    public SquaresAnalyzerTest(Integer from, Integer to, Integer expected)
    {
        this.to = to;
        this.from = from;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> cases()
    {
        return Arrays.asList(new Object[][]{
                {1, 2, 1},
                {4, 9, 2},
                {4, 17, 3},
                {10, 100, 7}
        });
    }

    @Test
    public void solution()
    {
        Integer actual = squaresAnalyzer.soulution(this.from, this.to);
        Assert.assertEquals(this.expected, actual);
    }
}