package Factorial;

import java.util.function.Function;

public class Factorial
{
    private Function<Integer, Integer> factorial = new Function<Integer, Integer>()
    {
        @Override
        public Integer apply(Integer integer)
        {
            assert integer >= 0;
            return (integer == 0) ? 1 : integer * apply(integer - 1);
        }
    };

    public int calc(int base)
    {
        return factorial.apply(base);
    }
}
