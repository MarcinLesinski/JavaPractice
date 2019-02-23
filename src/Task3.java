import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.println(String.format("%.3f",  result));
    }
}
