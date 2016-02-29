package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
   Поток побайтовой записи в файл
 */

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("file2.txt");
        byte[] buf = {100, 101, 102};
        os.write(123);
        os.write(buf);
        os.close();
    }
}
