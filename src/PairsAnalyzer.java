public class PairsAnalyzer
{
    public int soulution(int[] a)
    {
        Integer maxDistance = null;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                Integer distance = a[i] + a[j] + (i - j);

                if (maxDistance == null)
                    maxDistance = distance;
                else
                    maxDistance = Math.max(maxDistance, distance);
            }
        }
        return maxDistance;
    }
}
