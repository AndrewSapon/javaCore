package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
  1) Написать метод, который в качестве параметра принимает имя файла.
  Метод возвращает двухмерный массив (String): имена переменных и значение.
  <p>
  В файле набор переменных указаны так:
  ;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe];
  Существуют правила форматирования текста в файле:
  - имя переменной всегда стоит между симвоами ';' и '='
  - значение переменной всегда идет после знака '=' и заключено в квадратные кавычки
  - все что идет после квадратных кавычек до ';' являются служебными символами и в данной задаче они игнорируются
  <p>
  2) В мейне:
  - создать массив,
  - считать с консоли имя файла,
  - передать его в метод 1
  - полученный массив передать в метод 2
 */
public class Task04 {

    public static void main(String... args) throws FileNotFoundException {
        method("D://Dell//Yo.txt");
    }

    public static String[][] method(String fileName) throws FileNotFoundException {
        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);
        String[][] mainArray = new String[3][2];
        //String fileName = "v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe];";
        while (scan.hasNextLine()) {
            String[] array = scan.nextLine().split(";");

            for (int i = 0; i < array.length; i++) {
                //System.out.print(array[i].substring(0, (array[i].indexOf("="))) + " ");
                mainArray[i][0] = "Имя переменной: " + array[i].substring(0, (array[i].indexOf("="))) + " ";
                mainArray[i][1] = "Значение переменной: " + array[i].substring((array[i].indexOf("[") + 1), (array[i].indexOf("]")));
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%7s", mainArray[i][j]);
            }
            System.out.println();
        }
        return mainArray;
    }
}
