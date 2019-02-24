package ChristamsTreeGenerator;

import FormaterOfAmericanPhoneNumbers.Formater;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GeneratorTest
{
    private int input;
    private String expected;

    private Generator generator = new Generator();

    public GeneratorTest(int input, String expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        final String n = System.lineSeparator();
        return Arrays.asList(new Object[][]
                {
                        {0, ""},
                        {1, "*" + n},
                        {2, " * " + n + "***" + n},
                        {3, "  *  " + n + " *** " + n + "*****" + n}
                });
    }

    @Test
    public void solution_correctData_shouldPass()
    {
        String actual = generator.generate(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}