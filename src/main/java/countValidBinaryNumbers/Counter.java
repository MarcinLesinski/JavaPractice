package countValidBinaryNumbers;

import java.util.List;

/**
 * Can you help me? I need to know how many lines there are where the number of 0's is a multiple of 3 or the numbers of 1s is a multiple of 2.
 */
public class Counter
{
    private final List<String> lines;

    public Counter(List<String> lines)
    {
        this.lines = lines;
    }

    /**
     *
     * @return number of valid lines
     */
    public int calc()
    {
        return (int) lines.stream().filter(this::isLineValid).count();
    }

    private boolean isLineValid(String line)
    {
        long zeros = line.chars().filter(c -> c == '0').count();
        long ones = line.chars().filter(c -> c == '1').count();

        return (zeros % 3 == 0) || (ones % 2 == 0);
    }
}
