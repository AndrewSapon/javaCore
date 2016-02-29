package tasksOOP.bus;

import java.util.Scanner;

/**
 * Задача Автобус
 * (Bus и MainBus).
 * Написать класс Bus:
 * - с полем целочисленным countHuman (количество пассажиров)
 * - с метод void addHuman(int countHuman) (+ или - пассажиров)
 * - с методом printAboutMe (метод выводит количество пассажиров)
 * Также в методе addHuman, в случае уменьшения количества людей, не допускать, чтобы количество пассажиров было меньше 0.
 * Сделать консольное меню.
 */
public class MainBus {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setBussType("Богдан");
        System.out.println("Автобус, типа: " + bus.getBussType());
        System.out.println("Вместимость: 50 человек");

        boolean runWhile = true;
        while (true) {
            Scanner scan = new Scanner(System.in);
            bus.printAboutMe();
            try {
                System.out.println("Введите кол-во людей: ");
                int k = scan.nextInt();
                bus.addHuman(k);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

