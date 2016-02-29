package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Создать/использовать класс Авто(номер и двигатель авто). С консоли считать целое k.
 * Создать k объектов Авто(со случайными значениями), записать каждый объект в отдельный файл(в байтовый поток),
 * при этом имя файла соответсвует его номеру.
 * Затем считать байты из файла и преобразовать в текстовый вид
 */
public class Car implements Serializable {
    private String number;
    private Engine engine;

    BufferedReader reader;
    ArrayList<Car> list = new ArrayList<Car>();

    // метод сериализации  записывает в файл данные в виде байтов
    public void sireal(File file) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        for (int i = 0; i < k; i++) {
            list.add(new Car());
        }
        System.out.println(list);
        // запись
        for (int i = 0; i < k; i++) {
            FileOutputStream fos = new FileOutputStream(file.getPath() + "\\" + list.get(i).getNumber()); // "D:\\Serialization\\" + list.get(i).getNumber()
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            try {
                oos.writeObject(list.get(i));
            } finally {
                oos.close();
            }
        }
    }

    // метод десереализации считывает с файла байты и преобразует их в текстовый вид
    public void deSireal(File file) throws IOException, ClassNotFoundException {

        File[] files = file.listFiles();

        for (File elem : files) {

            try {
                // чтение
                FileInputStream fis = new FileInputStream(elem.getAbsoluteFile());
                ObjectInputStream oin = new ObjectInputStream(fis);

                try {
                    Car f = (Car) oin.readObject();
                    System.out.println(f);
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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Engine engine1 = new Engine();
        Car car1 = new Car();
        System.out.println(car1.getNumber());
        System.out.println(car1.getEngine().getNumber());
        // записываем
        car1.sireal(new File("D:\\\\Serialization"));
        // читаем
        car1.deSireal(new File("D:\\\\Serialization"));

        car1.setNumber("BB 2222");
        engine1.setNumber("qwerty");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public Car() {
        this.number = "AA" + (int) (1000 * Math.random());
        Engine e = new Engine();
        this.setEngine(e);
    }

    @Override
    public String toString() {
        return "Car [number=" + number + ", eng=" + engine.getNumber() + "]";
    }
}

