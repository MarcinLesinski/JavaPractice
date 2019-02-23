import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoinsSpinner
{
    public int solution(int[] a)
    {
        for (int i : a) assert a[i] == 0 || (a[i] == 1);
        List<Integer> coins = new ArrayList<>();
        for ( int i : a ) coins.add(i);

        int firstSideOccurences  = Collections.frequency(coins, 0);
        int secondSideOccurences = Collections.frequency(coins, 1);

        return Math.min(firstSideOccurences, secondSideOccurences);
    }

}
