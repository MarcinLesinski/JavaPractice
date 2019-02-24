package CellsDistance;

public class Analyzer
{
    /**
     * Analyze maximal distance in given array. The following formula
     * is used to calculate the distance:<br>
     * <b> distance = A[i] + A[j] + ( i - j) </b>
     * @return maximal distance between  cells in the given array
     *
     */

    public int analyze(int[] arrayForAnalysis)
    {
        Integer maxDistance = null;
        for (int i = 0; i < arrayForAnalysis.length; i++)
        {
            for (int j = 0; j < arrayForAnalysis.length; j++)
            {
                Integer distance = arrayForAnalysis[i] + arrayForAnalysis[j] + (i - j);

                if (maxDistance == null)
                    maxDistance = distance;
                else
                    maxDistance = Math.max(maxDistance, distance);
            }
        }
        return maxDistance;
    }
}
