package besant;
import java.util.Scanner;

public class Marks
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter marks " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        double average = sum / 5.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
