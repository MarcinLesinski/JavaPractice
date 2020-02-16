package FizzBuzz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;

//TODO: Consider testing method mapping a single number and second method that sticks mapped numbers together
@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private final Integer from;
    private final Integer to;
    private final List<String> expected;

    private FizzBuzz fizzBuzz;

    public FizzBuzzTest(Integer from, Integer to, List<String> expected)
    {
        this.from = from;
        this.to = to;
        this.expected = expected;
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void generationTest()
    {
        List<String> actual = fizzBuzz.generate(from, to);
        Assert.assertThat(actual, is(expected));
    }

    @Parameterized.Parameters
    public static Collection cases()
    {
        Collection common = Arrays.asList(new Object[][]
                {
                        testCase(FizzBuzz.BUZZ_BASE, FizzBuzz.BUZZ_BASE, FizzBuzz.BUZZ_LABEL),
                        testCase(FizzBuzz.FIZZ_BASE, FizzBuzz.FIZZ_BASE, FizzBuzz.FIZZ_LABEL),
                        testCase(FizzBuzz.FIZZ_BUZZ_BASE, FizzBuzz.FIZZ_BUZZ_BASE, FizzBuzz.FIZZ_BUZZ_LABEL),
                        testCase(FizzBuzz.FIZZ_BASE, FizzBuzz.FIZZ_BASE, FizzBuzz.FIZZ_LABEL)
                });

        Collection Fizz3Buzz5 = Arrays.asList(new Object[][]
                {
                        testCase(1, 5, "1", "2", FizzBuzz.FIZZ_LABEL, "4", FizzBuzz.BUZZ_LABEL),
                        testCase(6, 6, FizzBuzz.FIZZ_LABEL),
                        testCase(20, 20, FizzBuzz.BUZZ_LABEL),
                        testCase(300, 300, FizzBuzz.FIZZ_BUZZ_LABEL)

                });

        if (FizzBuzz.FIZZ_BASE == 3 && FizzBuzz.BUZZ_BASE == 5)
            common = (Collection) Stream.concat(common.stream(), Fizz3Buzz5.stream()).collect(Collectors.toList());

        return common;

    }

    private static Object[] testCase(Integer from, Integer to, String... expected)
    {
        return new Object[]{from, to, Arrays.asList(expected)};
    }
}
