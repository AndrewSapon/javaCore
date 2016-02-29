package files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 Work with files
 */
public class FilesExample {
    public static void main(String[] args) throws IOException {
        File f = new File("d://Dell");
        File[] files = f.listFiles(); // files.length!!! error  // выдает все что есть в папке(узлы)  если нету ничего в  файле то null
        System.out.println("files=" + files);

        System.out.println(Arrays.toString(files));
        System.out.println("CanonicalPath = " + f.getCanonicalPath());
        System.out.println("AbsolutePath = " + f.getAbsolutePath());
        System.out.println("separator = " + File.separatorChar);  // символ разделения чтобы точно указать
        if (f.isDirectory()) System.out.println("Это директория");
        if (f.isFile()) System.out.println("Это файл");
        if (!f.exists()) f.createNewFile(); // так мы создаем файл
        f.mkdir(); // так мы создаем директорию   (не создаст промежуточные директории) в существующей папке
        f.mkdirs(); // так мы создаем директорию  гарантированно
        // Filereader, Filerider для чтения файла, обьекты потоков
    }
}
