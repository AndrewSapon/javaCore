package tasksOOP.table;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализовать трехуровневую архитектуру.
 * public interface Humanable {
 * public void takeGlass(AbstractGlass glass);
 * public void putGlass();
 * public void pourWaterOnTable(AbstractTable table);
 * public void fillGlass();
 * public void printAboutMe();
 * }
 * public interface Glassable {
 * public void pourFromMe();
 * }
 * public interface Tablable {
 * public boolean isDry();
 * }
 * <p>
 * Интерфейсы: Humanable, Tablable, Glassable,
 * Абстрактные классы: AbstractGlass, AbstractHuman, AbstractTable
 * Классы: HumanWoman, HumanMan, GlassCircle, GlassSquare, Table, MainClass
 * <p>
 * Когда выливается вода из стакана-стакан кричит я стакан круглый(или квадратный) выливаюсь.
 * Задание в Main:
 * 1. Создать массив из 4-х человек разного пола(пол определяется с помощью Math.random)
 * 2. Создать список из 10 столов.(пронумеровать столы, автоматически increment)
 * 3. Каждый на угад берет стаканы.
 * 4. Провести перекличку( для каждого вызвать метод printAboutMe(Я м/ж и (если есть) у меня стакан кр/кв))
 * 5. Для каждого человека с консоли определяем индекс стола, человек выливает воду на стол(если у него есть стакан).
 * 6. Провести опрос столов на предмет сухости (вызов методов isDry).
 */
public class Test {
    public static void main(String... args) {
        // 1. Создать массив из 4-х человек разного пола(пол определяется с помощью Random)
        List<AbstractHuman> humanList = new ArrayList<AbstractHuman>();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            boolean value = rand.nextBoolean();
            if (value == true)
                humanList.add(new HumanWoman());
            else
                humanList.add(new HumanMan());
            System.out.println(humanList.get(i));
        }

        // 2. Создать список из 10 столов.(пронумеровать столы, автоматически increment)
        List<Table> tableList = new ArrayList<Table>();
        for (int i = 0; i < 10; i++) {
            tableList.add(new Table());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(tableList.get(i) + " номер: " + tableList.get(i).getAboutTableNumber() + "чистый? - " + tableList.get(i).isDry());
        }

        // 3. Каждый на угад берет стаканы.
        for (int i = 0; i < humanList.size(); i++) {
            boolean status = rand.nextBoolean();
            if (status == true)
                humanList.get(i).takeGlass(new GlassCircle());
            else
                humanList.get(i).takeGlass(new GlassSquare());
        }

        // 4. Провести перекличку( для каждого вызвать метод printAboutMe(Я м/ж и (если есть) у меня стакан кр/кв))

        for (int i = 0; i < humanList.size(); i++) {
            humanList.get(i).printAboutMe();
        }

        //  5. Для каждого человека с консоли определяем индекс стола, человек выливает воду на стол(если у него есть стакан).
        try {
            for (int i = 0; i < humanList.size(); i++) {
                System.out.println("Введите индекс стола [0, 9]: ");
                int a = scan.nextInt();
                humanList.get(i).pourWaterOnTable(tableList.get(a));
                tableList.get(a).isDry();
            }
        } catch (Exception e) {

        }

        // 6. Опрос столов на предмет сухости
        for (int i = 0; i < tableList.size(); i++) {
            System.out.println("Я  " + tableList.get(i).getAboutTableNumber() + ", чистый ли я? - " + tableList.get(i).isDry());
        }
    }

}