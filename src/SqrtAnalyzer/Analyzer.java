package SqrtAnalyzer;

public class Analyzer
{
    /**
     *
     * @param from first number <i><small>(included)</small></i> in analyzed range.
     * @param to last number <i><small>(included)</small></i> in analyzed range.
     * @return number of whole square in range[from, to].
     */

    public Integer analyze(Integer from, Integer to)
    {
        Integer result = 0;
        for (int i = from; i <= to; i++)
        {
            int base = (int) Math.ceil(Math.sqrt(i));
            int verification = base * base;
            if ( verification == i)
            {
                result++;
            }
        }
        return result;
    }
}
