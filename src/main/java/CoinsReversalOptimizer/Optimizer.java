package CoinsReversalOptimizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Optimizer
{
    /**
     *
     * @param coins array with sides of coins.
     *              <br> 0 means heads side,
     *              <br> 1 means tails side.
     * @return Method returns minimal number of coins you have to reverse  that they are all  on the same side.
     */
    public int optimize(int[] coins)
    {
        final int heads = 0;
        final int tails = 1;
        for (int i : coins) assert coins[i] == heads || (coins[i] == tails);

        List<Integer> coinsCasted = new ArrayList<>();
        for ( int i : coins ) coinsCasted.add(i);

        int firstSideOccurences  = Collections.frequency(coinsCasted, heads);
        int secondSideOccurences = Collections.frequency(coinsCasted, tails);

        return Math.min(firstSideOccurences, secondSideOccurences);
    }
}
