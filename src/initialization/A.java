package initialization;


public class A {
    {
        System.out.println("1A");
    }

    static {
        System.out.println("2A");
    }

    public A() {
        System.out.println("3A");
    }
}

