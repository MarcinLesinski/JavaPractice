import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberAsText = String.format("%d", number);
        System.out.println(numberAsText.charAt(numberAsText.length() - 1));
    }
}
