package SeasionsTemperatureAplitudeAnalyzer;

import java.util.*;

public class Analyzer
{
    /**
     * @param yearData array with average temperatures in every day in whole year .
     *                 <i><small>(Planets other than Earth are also considered here, so number of days per year may differ from the Earth's one.)</i></small>
     *                 Number of days must  be divisible by 4.
     * @return Season with highest temperature amplitude.
     */

    public Season analyze(int[] yearData)
    {
        assert yearData.length % 4 == 0;
        for (int temperature : yearData)
            assert temperature >= -1000 && temperature <= 1000;

        final int impossibleToReachTheTemperatureAmplitude = -2000;
        int maxAplitude = impossibleToReachTheTemperatureAmplitude;
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
        }
        return Season.values()[maxAplitudeSeasonID];
    }

    private List<Integer> extractSeason(int seasonIndex, int[] yearData)
    {
        List<Integer> year = new ArrayList<>();
        for (int i : yearData) year.add(i);
        int seasonLength = yearData.length / 4;
        List<Integer> season = year.subList(seasonIndex * seasonLength, (seasonIndex * seasonLength) + seasonLength);
        return season;
    }

    private int amplitude(List<Integer> season)
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