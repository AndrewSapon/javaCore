package initialization;

/**
 Этот простой пример хорошо показывает следующее:
 cначало инициализируются static блоки, затем обычные родителя, потом  конструктор родителя, затем обычные наследника, конструктор наследника
 2A
 2B
 1A
 3A
 1B
 3B
 1A
 3A
 1B
 3B
 */
public class MainAB
{
    public static void main (String ... args)
    {
        B b = new B();
        B b1 = new B();
    }
}
