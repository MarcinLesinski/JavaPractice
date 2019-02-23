import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

import static java.lang.Integer.*;

public class Main
{
    static Function<Integer, Integer> factorial2 = i -> (i == 0) ? 1 : i * Main.factorial2.apply(i - 1);

    public static void main(String[] args)
    {
        assert false;
        Function<Integer, Integer> factorial = new Function<Integer, Integer>()
        {
            @Override
            public Integer apply(Integer integer)
            {
                assert integer >= 0;
                return (integer == 0) ? 1 : integer * apply(integer - 1);
            }
        };

        int i = factorial.apply(-9);
        System.out.println(i);
    }
}
