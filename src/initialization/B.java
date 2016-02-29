package initialization;


public class B extends A
{
    {
        System.out.println("1B");
    }
    static
    {
        System.out.println("2B");
    }

    public B()
    {
        System.out.println("3B");
    }

}

