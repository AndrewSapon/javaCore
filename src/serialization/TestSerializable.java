package serialization;

/**
 Суть сериализации:
 мы записываем в файл побайтово данные, тоесть сериализуем их
 и потом читаем на другом конце сети например и десериализуем - переводим обратно байты в читаемый вид
 transient - модификатор доступа к полю - поле не учавствует в сериализации.
 Задание:
 Создать/использовать класс Авто(номер и двигатель авто). С консоли считать целое k.
 Создать k объектов Авто(со случайными значениями), записать каждый объект в отдельный файл(в байтовый поток),
 при этом имя файла соответсвует его номеру.
 Затем считать байты из файла и преобразовать в текстовый вид
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
    public static void main(String[] args) {
        try {
            Product pr1 = new Product("Колбаса");

            // запись
            FileOutputStream fos = new FileOutputStream("temp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            try {
                oos.writeObject(pr1);
            } finally {
                oos.close();
            }

            // чтение
            Product pr2;
            FileInputStream fis = new FileInputStream("temp.out");
            ObjectInputStream oin = new ObjectInputStream(fis);
            try {
                pr2 = (Product) oin.readObject();
                System.out.println(pr2);

            } finally {
                oin.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
