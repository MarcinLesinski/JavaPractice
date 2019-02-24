package FormaterOfAmericanPhoneNumbers;

import CoinsReversalOptimizer.Optimizer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FormaterTest
{
    private String input;
    private String expected;

    private Formater formater = new Formater();

    public FormaterTest(String input, String expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        return Arrays.asList(new Object[][]
                {
                        {" -", ""},
                        {"  ", ""},
                        {"-2", "2"},
                        {"1", "1"},
                        {"12", "12"},
                        {"123", "123"},
                        {"1234", "12-34"},
                        {"12345", "123-45"},
                        {"123456", "123-456"},
                        {"1234567", "123-45-67"},
                        {"12345678", "123-456-78"},
                        {"123456789", "123-456-789"},
                        {"1234567890", "123-456-78-90"}
                });
    }

    @Test
    public void solution_correctData_shouldPass()
    {
        String actual = formater.format(this.input);
        Assert.assertEquals(this.expected, actual);
    }
}