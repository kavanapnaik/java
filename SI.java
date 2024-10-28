package besant;
import java.util.Scanner;

public class SI
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the rate of interest (in %): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the time period (in years): ");
            int time = scanner.nextInt();

            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("The Simple Interest is: " + simpleInterest);

            scanner.close();
        }
}
