package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Запросить у пользователя число. Определить єто целое число, дробное число или не число.
 */
public class BufferedReaderExample {

    BufferedReader reader;// = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws IOException {
        BufferedReaderExample b = new BufferedReaderExample();
        BufferedReaderExample b1 = new BufferedReaderExample();
        b.m();
        b1.m();
    }

    public void m() throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        double a;
        long b;
        try {
            s = reader.readLine();

            if (s.contains(".")) {
                a = Double.parseDouble(s);
                System.out.println("Дробное число: " + a);
            } else {
                b = Long.parseLong(s);
                System.out.println("Целое число: " + b);
            }
        } catch (NumberFormatException e) {
            System.out.println("Не число");
        }
    }
}

