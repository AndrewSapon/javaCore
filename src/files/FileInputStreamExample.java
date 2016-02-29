package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
   Поток побайтового чтения из файла
 */

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file2.txt");
        int example = 3;
        int k;

        if (example == 1) {
            int codeChar = 10;
            while (codeChar > -1) {
                codeChar = is.read();
                System.out.println(codeChar + " = [" + ((char) codeChar) + "]");
            }
        }
        if (example == 2) {
            byte[] buf = new byte[20];
            k = is.read(buf);
            System.out.println("k=" + k);
            for (byte b : buf) System.out.println("[" + b + "]=[" + (char) (b) + "]");
        }
        if (example == 3) {
            is.read();
            int len = is.available();
            System.out.println(len);
            byte[] buf = new byte[len];
            k = is.read(buf);
            System.out.println("k=" + k);
            for (byte b : buf) System.out.println("[" + b + "]=[" + (char) (b) + "]");
        }
    }
}