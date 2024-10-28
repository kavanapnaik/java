package package3;

public class MethodAccessDemo
{
    // Public method
    public void publicMethod()
    {
        System.out.println("Public method accessed");
    }

    // Protected method
    protected void protectedMethod()
    {
        System.out.println("Protected method accessed");
    }

    // Package-Default method (no modifier)
    void packageDefaultMethod()
    {
        System.out.println("Package-default method accessed");
    }

    // Private method
    private void privateMethod()
    {
        System.out.println("Private method accessed");
    }

    public void accessPrivateMethod()
    {
        privateMethod();
    }
}
