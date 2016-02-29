package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReaderWriterExample {
    public static void main(String[] args) throws Exception {
        String fileName = "D://Dell//Yo.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write("stroka YOoo\n15d\t9");
        fw.write("stroka 2");
        //fw.flush();
        fw.close();

        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);
        int i = 0;
        while (scan.hasNextLine()) {
            System.out.println("строка с номером :" + i + ": " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}

