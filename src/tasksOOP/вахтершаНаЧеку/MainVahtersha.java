package tasksOOP.вахтершаНаЧеку;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Задача Вахтерша на чеку.
 Vahtersha и MainVahtersha.
 Вахтерша многоэтажного дома умеет:
 - addOwners(int count) - добавить хозяев
 - addFriends(int count) - добавить чужаков
 - removeOwners(int count)
 - removeFriends(int count)
 - printInfo() - метод выводит количество своих и чужих в доме.
 Вахтерша не может допустить превышение чужих над своими.
 Консольное меню.
 */
public class MainVahtersha
{
    public static void main(String[] args)
    {
        Vahtersha petrovna = new Vahtersha();
        petrovna.setName("Петровна");
        petrovna.setAge(84);
        petrovna.getName();
        petrovna.getAge();

  boolean runWhile = true;

        while (runWhile)
        {
            petrovna.printInfo();
            try
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите цифру: ");
                int k = scan.nextInt();
                System.out.println("Введите колличество людей: ");
                int people = scan.nextInt();

                if (k == 0) {
                    petrovna.addOwners(people);
                    System.out.println();
                }
                else if (k == 1){
                    petrovna.removeOwners(people);
                    System.out.println();
                }
                else if (k == 2){
                    petrovna.addFriends(people);
                    System.out.println();
                }
                else if (k == 3){
                    petrovna.removeFriends(people);
                    System.out.println();
                }
                else {
                    runWhile = false;
                    System.out.println("Выход из программы");
                    break;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Вы ввели не число, как вам не стыдно?");
            }
        }
    }
}

