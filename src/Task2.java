import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.substring(0, 2);
        System.out.println(text);
    }
}
