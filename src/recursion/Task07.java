package recursion;

import java.io.File;

/**
   Написать метод, принимающий в качестве параметра строку с значением папки на компьютере.
   С помощью рекурсии получить список всех файлов и всех папок этой папки с помощью рекурсии.
   -book
   --directory1
   ----file1
   ----file2
   --directory2
   ----directory3
   ------directory4
   --------directory5
   ----------file3
 */
public class Task07 {
    public static void main(String[] args) {
        Task07 tf = new Task07();
        tf.getFileNameFromFolder("D://IDE");
    }

    static String tmp = "-";

    public void getFileNameFromFolder(String folderName) {
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isDirectory()) {
                tmp += "-";
                System.out.print(tmp);
                System.out.println(listOfFiles[i].getName());
                getFileNameFromFolder(folderName + "/" + listOfFiles[i].getName());
            } else {
                System.out.print(tmp);
                System.out.println(listOfFiles[i].getName());
            }
        }
        tmp = tmp.substring(0, tmp.length() - 1);
    }
}
