package recursion;

/**
 Написать рекурсивный метод, который принимает в качестве параметров k.
 Метод выводит числа от 2 до k.
 */
public class Task02 {
    public static void main(String... args) {
        int k = 27;
        f(k);
    }

    public static void f(int k) {
        if (k <= 1)
            return;
        f(k - 1);
        System.out.println(k);
    }
}
