package files;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 Запросить с консоли путь папки и расширение. Вывести на экран все файлы с раширением из этой папки(без иерархии)..
 */
public class Task01 {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        File f = new File(scan.next());
        System.out.println(f);
        File[] files = f.listFiles();
        System.out.println(Arrays.toString(files));
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().contains("txt"))
                System.out.println(files[i].getName());
        }
    }

}

