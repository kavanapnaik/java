package besant;

import java.util.Scanner;

public class Basic
{

    public static void main(String[] args)
    {
        char n1,n2;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the values");
        n1=x.next().charAt(0);
        n2=x.next().charAt(0);

        System.out.println("1.less than "+(n1<n2));//1<1--->false
        System.out.println("2.Greater than "+(n1>n2));//1>1-->false
        System.out.println("3.less than or equal to "+(n1<=n2));//1<=1--->True
        System.out.println("4.Greater than or equal to "+(n1>=n2));//1>=1--->True
        System.out.println("5.Equal to "+(n1==n2));//1==1-->True
        System.out.println("6.not equal to "+(n1!=n2));//1!=1-->false
    }

}
