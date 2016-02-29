package files;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * SpecialThread. Запросить путь на папку с консоли, получить список всех папок заданной папки с учетом иерархии.
 * Например, поиск в папке "book" даст 5 элементов:
 * -book
 * --directory1
 * ----file1
 * ----file2
 * --directory2
 * ----directory3
 * ------directory4
 * --------directory5
 * ----------file3
 */
public class Task02 {
    public static void main(String... args) {
        List<File> fileList;
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        File f = new File(s);
        System.out.println("--" + s);
        File[] files = f.listFiles();
        fileList = Arrays.asList(files);

        for (int i = 0; i < fileList.size(); i++) {
            if (fileList.get(i).isFile())
                System.out.println(fileList.get(i).getName());

            if (fileList.get(i).isDirectory()) {
                System.out.println("--" + fileList.get(i).getName());
                fileList.get(i).getPath();
                File n = new File(fileList.get(i).getPath());
                File[] n2 = n.listFiles();

                for (int j = 0; j < n2.length; j++) {
                    if (n2[j].isFile())
                        // System.out.println(Arrays.toString(n2));
                        System.out.println("" + n2[j].getName());
                    if (n2[j].isDirectory())
                        System.out.println("-----" + n2[j].getName());
                }

            }
        }
    }
}
