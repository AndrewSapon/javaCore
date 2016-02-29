package initialization;

/**
 Этот простой пример хорошо показывает следующее:
 cначало инициализируются static блоки, затем обычные родителя, потом  конструктор родителя, затем обычные наследника, конструктор наследника
 */
public class MainAB
{
    public static void main (String ... args)
    {
        B b = new B();
        B b1 = new B();
    }
}
