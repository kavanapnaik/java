package besant;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {

        float n1, n2;

        boolean And, Or, Not;
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the values");

        n1 = x.nextFloat();
        n2 = x.nextFloat();

        And = (n1 < n2) && (n1 > n2);//(50<65)&&(50>65)--->1 && 0-->0(false)
        Or = (n1 <= n2) || (n1 >= n2);//(50<=65)||(50>=65)--->1 || 0--->1(true)
        Not = !(n1 >= n2);//!(50>=65)--->!(0)---->1(true)

        System.out.println("1.Logical And " + And);
        System.out.println("2.Logical Or " + Or);
        System.out.println("3.Logical Not " + Not);
    }
}

