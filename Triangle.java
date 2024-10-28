package besant;
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();


        double perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of the triangle is: " + perimeter);

        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}
