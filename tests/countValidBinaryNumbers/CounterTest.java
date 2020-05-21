package countValidBinaryNumbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CounterTest
{

    private Counter counter;
    @Before
    public void setUp() throws Exception
    {
        List<String> lines = Files.readAllLines(Paths.get("tests/countValidBinaryNumbers/BinaryNumbers.dat"));
        counter = new Counter(lines);
    }

    @Test
    public void calc()
    {
        int actual = counter.calc();
        Assert.assertEquals(6662, actual);
    }
}