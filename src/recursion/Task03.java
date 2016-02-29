package recursion;

/**
   Написать метод, который считает факториал для числа n.
 */
public class Task03 {
    public static void main(String... args) {
        int k = 5;
        System.out.println(fact(k));
    }

    public static long fact(long k) {
        if (k < 0)
            throw new IllegalArgumentException();
        if (k <= 1)
            return 1;       // условие выхода из рекурсии
        else
            return k * fact(k - 1); // метод вызывает сам себя
    }
}
