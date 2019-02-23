public class SquaresAnalyzer
{
    public Integer soulution(Integer from, Integer to)
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
