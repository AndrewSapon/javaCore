package tasksOOP.lift;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Задача Лифт
 (Lift и MainLift).
 Будем считать, что все люди в дом попадают только через лифт, убывают тем же способом.
 В доме есть лестница(не попадающая на 1 этаж), которой могут пользоваться люди в доме.
 Поля объекта Lift не менять напрямую.(только через метод)
 На первом этаже тех этаж(тут люди не живут).
 Поля:
 - текущий этаж curFloor
 - общее количество этажей перемещения countFloat
 - общее количество перевезенных людей countPeople
 - количество людей находящихся в данный момент в доме. currentCountPeople
 У лифта методы:
 - метод перемещения лифта с номером этажа для перемещения nextFloor и количеством человек countHuman:
 move(int nextFloor, int countHuman)
 - метод выводящий состояние лифта(значение всех полей объекта): printAboutMe()
 Консольное меню!
 информацию получаем методом printAboutMe.
 */

public class MainLift {

    private static int readFloat(Scanner s) throws MyException {
        int num = s.nextInt();
        if (num <= 0 || num > 5) {
            throw new MyException("Этаж не существует");
        }

        return num;
    }

    static int inLift = 0;

    private static int readPeople(Scanner s) throws MyException {
        int num = s.nextInt();
        int tmp = num + inLift;
        if (tmp > 4)
            throw new MyException("Не входят в лифт");
        else if (tmp < 0)
            throw new MyException("В лифте нет столько людей");
        else
            System.out.println("В лифте изменения " + tmp + " людей");
        System.out.println("Введите следующий этаж [1. 2. 3. 4. 5]: ");
        return num;
    }

    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Lift lift = Lift.getLift();
        boolean test = true;
        while (test) {
            Scanner s = new Scanner(System.in);
            try {
                lift.printAboutMe();
                System.out.println("Введите сколько людей зашло или вышло");
                lift.move(readPeople(s), readFloat(s));
            } catch (MyException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                continue;
            }
        }
    }
}