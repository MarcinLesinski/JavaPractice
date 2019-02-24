package ChristamsTreeGenerator;

public class Generator
{
    public String generate(int levelsCount)
    {
        String result = "";
        for (int i = 0; i < levelsCount; i++)
        {
            int starsCount = (i * 2) + 1;
            int spacesCount = (levelsCount - 1) - i;
            String line = stringOfChars(spacesCount, " ") + stringOfChars(starsCount, "*") + stringOfChars(spacesCount, " ");
            result = result + line + System.lineSeparator();
        }
        return result;
    }

    private String stringOfChars(int count, String c)
    {
        String result = "";
        for (int i = 0; i < count; i++) result = result + c;
        return result;
    }
}