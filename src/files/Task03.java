package files;

import java.io.FileWriter;

/**
  Написать метод, который заполняет файл четными числами от k1 до к2.
  Все числа в отдельной строке.
  Этот метод принимает имя файла , к1 и к2 в качестве параметра.
 */
public class Task03 {
    public static void main(String... args) throws Exception {
        String sFileName = "D://Dell//Yo.txt";
        int k1 = 10;
        int k2 = 30;
        myMethod(sFileName, k1, k2);
    }

    public static void myMethod(String sFileName, int k1, int k2) throws Exception {

        FileWriter fr = new FileWriter(sFileName);
        for (int i = k1; i <= k2; i++) {
            if (k1 % 2 == 0)
                fr.write(k1 + "\n");
            k1++;
        }
        fr.close();
    }
}
