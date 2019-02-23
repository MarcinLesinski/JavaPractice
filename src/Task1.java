import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        int count = 0;
//        do
//        {
//
//            count++;
//        } while ();


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        float c = (float) (a + b) / 2;
        System.out.println(c);

        try
        {
        } catch (ArithmeticException e)
        {
            System.out.println("Operation can''t be calculated. " + e.getMessage());
        }
    }


}
