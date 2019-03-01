package DicesRollOptimizer;

import java.util.stream.IntStream;

public class Optimizer
{
    private int[] numbersOfPipsOnDices;
    public int optimize(int[] numbersOfPipsOnDices)
    {
        this.numbersOfPipsOnDices = numbersOfPipsOnDices;
        int movesNeddedForAllDicesEqualsEqchOthers = 0;

        DicePipsGenerator pipsGenerator = new DicePipsGenerator();
        for (Integer pips : pipsGenerator)
        {
            movesNeddedForAllDicesEqualsEqchOthers = Math.min(movesNeddedForAllDicesEquals(pips), movesNeddedForAllDicesEqualsEqchOthers);
        }
        return movesNeddedForAllDicesEqualsEqchOthers;
    }

    private int movesNeddedForAllDicesEquals(int pips)
    {
        int neededMoves = 0;
        for (int i = 0; i < numbersOfPipsOnDices.length; i++)
        {
            neededMoves += numberOfRollToMoveDice(numbersOfPipsOnDices[i], pips);
        }
        return neededMoves;
    }

    private int numberOfRollToMoveDice(int from, int to)
    {
        if (from == to)
            return 0;

        return from + to == 7 ? 2 : 1;
    }

}




