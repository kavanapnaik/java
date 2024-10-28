package besant;
import java.util.Scanner;
public class EX1
{

    public static void main(String[] args)
    {
        float n1,n2;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the values");
        n1=x.nextFloat();
        n2=x.nextFloat();

        System.out.println("1.less than "+(n1<n2));//1<1--->false
        System.out.println("2.Greater than "+(n1>n2));//1>1-->false
        System.out.println("3.less than or equal to "+(n1<=n2));//1<=1--->True
        System.out.println("4.Greater than or equal to "+(n1>=n2));//1>=1--->True
        System.out.println("5.Equal to "+(n1==n2));//1==1-->True
        System.out.println("6.not equal to "+(n1!=n2));//1!=1-->false
    }

}
