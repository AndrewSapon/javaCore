package recursion;

/**
 * Написать рекурсивный метод, проверяющий является ли число простым.
 */
public class Task06 {
    public static void main(String... args) {
        System.out.println(isSimple(19, 2));
    }

    public static boolean isSimple(int number, int i) {
        if (number == 1) return false; // 1 - не простое число
        if (number == 2) return true; // особый случай

        if (number % i == 0) return false;

        if (i <= Math.sqrt(number)) // проверяем не все делители а только до корня квадратного из числа
            return isSimple(number, i + 1);
        else return true;
    }
}
