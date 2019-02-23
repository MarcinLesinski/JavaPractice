import java.util.*;

public class SeasonsAnalyzer
{
    public static void main(String[] args)
    {
        int[] year = {0,1, 0, 2, 0,3 ,0, 4};
        System.out.println(solution(year));
    }

    public static String solution(int[] yearData)
    {
        int maxAplitude = -2000;
        int maxAplitudeSeasonID = -1;
        for (int i = 0; i <= 3; i++)
        {
            List<Integer> season = extractSeason(i, yearData);
            int seasonAplitude = amplitude(season);
            if (seasonAplitude > maxAplitude)
            {
                maxAplitude = seasonAplitude;
                maxAplitudeSeasonID = i;
            }
            System.out.println(seasonAplitude);
        }

        String seasonName = "";
        switch (maxAplitudeSeasonID)
        {
            case 0:
                seasonName = "winter";
                break;
            case 1:
                seasonName = "spring";
                break;
            case 2:
                seasonName = "summer";
                break;
            case 3:
                seasonName = "autumn";
                break;
        }
        return seasonName;
    }

    private static List<Integer> extractSeason(int seasonIndex, int[] yearData)
    {
        List<Integer> year = new ArrayList<>();
        for (int i: yearData) year.add(i);
        int seasonLength = yearData.length / 4;
        List<Integer> season = year.subList(seasonIndex * seasonLength, (seasonIndex * seasonLength) + seasonLength);
        return season;
    }

    private static int amplitude(List<Integer> season)
    {
        int min = season.get(0);
        int max = season.get(0);
        for (int i = 0; i < season.size(); i++)
        {
            min = Math.min(min, season.get(i));
            max = Math.max(max, season.get(i));
        }
        return Math.abs(max - min);
    }
}