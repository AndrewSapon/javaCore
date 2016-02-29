package recursion;

/**
   Написать метод, который выводит n-ный член последовательности Фибоначчи.
 */
public class Task05 {
    public static void main(String[] args) {
        f(5);
    }

    public static int f(int x) {
        int result;
        System.out.print(" " + x);
        if (x == 0) {
            result = 0;
        } else if (x == 1) {
            result = 1;
        } else {
            result = f(x - 2) + f(x - 1);
        }
        return result;
    }
}
