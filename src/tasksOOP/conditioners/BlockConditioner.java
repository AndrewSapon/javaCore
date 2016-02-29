package tasksOOP.conditioners;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Делегирование - перевызываем методы Conditioner
 */
public class BlockConditioner {
    private ArrayList<Conditioner> list = new ArrayList<Conditioner>();

    // В конструкторе вносим 10 кондиционеров в ArrayList.
    public BlockConditioner() {
        for (int i = 0; i < 10; i++) {
            list.add(new Conditioner());
        }
    }

    // Консольное меню
    public static String[] operationNames = {
            "1. Отобразить состояние всех кондиционеров ",
            "2. Включить кондиционер с индексом... ",
            "3. Выключить кондиционер с индексом... ",
            "4. Установить температуру для кондиционера с индексом",
            "5. Выход"};

    public static void printMenu() {
        for (String elem : operationNames) {
            System.out.println(elem);
        }
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        boolean runWhile = true;

        while (runWhile) {
            printMenu();
            try {
                int k = scan.nextInt();

                switch (k) {
                    case 1:
                        statusOfAllConditioners(list);
                        System.out.println();
                        break;
                    case 2:
                        turnOn(list);
                        System.out.println();
                        break;
                    case 3:
                        turnOff(list);
                        System.out.println();
                        break;
                    case 4:
                        setConditionParametrs(list);
                        System.out.println();
                        break;
                    case 5:
                        runWhile = false;
                        System.out.println("Выход из программы");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы не правильно ввели число");
                return;
            }

        }
    }

    // Метод включения кондишена
    public void turnOn(ArrayList<Conditioner> list) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите индекс кондиционера: ");
            int index = scan.nextInt();

            if (list.get(index).isStatusCondition() == false) {
                list.get(index).setStatusCondition(true);
                System.out.println("Status: " + list.get(index).isStatusCondition());
            } else {
                System.out.println("Status: " + list.get(index).isStatusCondition());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Под этим индексом нету кондишена, вводите [0 -9]");
        }
    }

    // Метод выключения кондишена
    public void turnOff(ArrayList<Conditioner> list) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите индекс кондиционера: ");
            int index = scan.nextInt();

            if (list.get(index).isStatusCondition() == true) {
                list.get(index).setStatusCondition(false);
                System.out.println("Status: " + list.get(index).isStatusCondition());
            } else {
                System.out.println("Status: " + list.get(index).isStatusCondition());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Под этим индексом нету кондишена, вводите [0 -9]");
        }
    }

    // Установить температуру
    public void setConditionParametrs(ArrayList<Conditioner> list) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите индекс кондиционера: ");
            int index = scan.nextInt();
            System.out.println("Введите температуру: ");
            int temperature = scan.nextInt();

            list.get(index).setTemperature(temperature);
            System.out.println("Температура изменена: " + list.get(index).getTemperature());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Под этим индексом нету кондишена, вводите [0 -9]");
        }
    }

    // Отобразить состояние всех кондиционеров
    public void statusOfAllConditioners(ArrayList<Conditioner> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Кондиционер с индексом: " + i + " имеет статус: " + list.get(i).isStatusCondition() + " и температуру: " + list.get(i).getTemperature());
        }
    }
}
