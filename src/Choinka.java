import org.junit.platform.commons.util.StringUtils;

import java.util.Collections;

public class Choinka
{
    public static void main(String[] args)
    {
        choinka3(6);
    }

    public static void choinka(int liczbaPoziomow)
    {
        for (int i = 0; i < liczbaPoziomow; i++)
        {
            int liczbaGwiazdek = (i * 2) + 1;
            int liczbaSpacji = (liczbaPoziomow - 1) - i;
            String linija = stringOfChars(liczbaSpacji, " ") + stringOfChars(liczbaGwiazdek, "*") + stringOfChars(liczbaSpacji, " ");
            System.out.println(linija);
        }
    }

    private static String stringOfChars(int count, String c)
    {
        String result = "";
        for (int i = 0; i < count; i++) result = result + c;
        return result;
    }

    public static void choinka2(int x)
    {
        int n = 0;
        int p = (2 * x - 1) / 2; //poczatek
        int k = (2 * x - 1) / 2; //koniec
        for (int i = 0; i < ((2 * x) - 1); )
        {
            if (i >= p && i <= k)
            {
                System.out.print("*");
                i++;
            } else
            {
                System.out.print(" ");
                i++;
            }

            if (i % ((x * 2) - 1) == 0 && i != 0)
            {
                System.out.print("\n");
                i = 0;
                p--;
                k++;
                n++;
            }
            if (n == x)
            {
                break;
            }
        }
    }

    public static void choinka3(int n)
    {
        StringBuilder output1 = new StringBuilder();
        for (int i = 0;i < n; i++)
        {
            output1.append("                                   ", 0, n - i);
            output1.append("******************************************", 0, (i + 1) * 2 - 1);
            output1.append("\n");
        }
        System.out.println(output1);
    }
}
