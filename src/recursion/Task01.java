package recursion;

/**
 * Написать рекурсивный метод, который принимает в качестве параметров k.
 * Метод выводит числа от k до 2.
 */
public class Task01 {
    public static void main(String... args) {
        int k = 27;
        f(k);
    }

    public static void f(int k) {
        if (k <= 1)
            return;
        System.out.println(k);
        f(k - 1);
    }
}
