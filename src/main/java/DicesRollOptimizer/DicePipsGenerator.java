package DicesRollOptimizer;

import sun.nio.cs.Surrogate;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class DicePipsGenerator implements Iterable<Integer>, Iterator<Integer>
{
    private int index = 1;

    @Override
    public boolean hasNext()
    {
        return index != 6;
    }

    @Override
    public Integer next()
    {
        index++;
        return index;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return this;
    }
}
