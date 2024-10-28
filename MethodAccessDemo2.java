package package3;

public class MethodAccessDemo2
{
    public static void main(String[] args)
    {
        MethodAccessDemo demo = new MethodAccessDemo();

        // Acc public method
        demo.publicMethod();

        // Acc protected method
        demo.protectedMethod();

        // Acc package-default method
        demo.packageDefaultMethod();

        // Acc private method by public method
        demo.accessPrivateMethod();
    }
}
