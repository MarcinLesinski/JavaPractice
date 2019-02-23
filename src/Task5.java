import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        try
        {
            float result = 1 / number;
            System.out.println(String.format("%.2f", result));
        } catch (ArithmeticException e)
        {
            System.out.println("Can not calculate this operation.");
        }
    }
}
