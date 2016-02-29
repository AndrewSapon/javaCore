package tasksOOP.plane;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача Самолет
 * (Plane и MainPlane).
 * Написать класс Самолет:
 * - метод public void up() – самолет поднимается вверх
 * - метод public void down() – самолет опускается вниз
 * - метод public void printAboutMe() – метод сообщает, где самолет(^ или v)
 * Написать класс MainСамолет: Консольное меню!
 * В классе Самолет, должно быть поле, которое отвечает за состояние самолета(то есть запоминать чем занимается самолет).
 * <p>
 * Поля объекта не менять напрямую(только через методы).
 * Методы up и down – должны проверять, чем занимается самолет.
 * Если самолет внизу, то вызов метода up – меняет положение самолета и выводит сообщение (я взлетел).
 * Если самолет вверху, то вызов метода up – меняет положение самолета и выводит сообщение (я не могу взлететь, так как уже в воздухе).
 * Метод  down должен аналогично вывести сообщение: (я сел) или (не могу сесть, так как уже сижу).
 * <p>
 * Консольное меню!
 */
public class MainPlane {
    public static void main(String[] args) {
        Plane plain = new Plane();
        plain.setPlaneType("AN - 24");
        plain.setAirLinesType("Aerosvit");
        System.out.println("Самолет " + plain.getPlaneType() + ", авиакомпании " + plain.getAirLinesType());

        boolean runWhile = true;

        while (runWhile) {
            Scanner scan = new Scanner(System.in);
            plain.printAboutMe();
            try {
                int k = scan.nextInt();

                switch (k) {
                    case 0:
                        plain.up();
                        System.out.println();
                        break;
                    case 1:
                        plain.down();
                        System.out.println();
                        break;
                    case 2:
                        runWhile = false;
                        System.out.println("Выход из программы");
                }
            } catch (InputMismatchException e) {

            }
        }
    }
}
