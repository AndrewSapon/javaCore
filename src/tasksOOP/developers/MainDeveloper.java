package tasksOOP.developers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Andrew on 30.12.2015.
 */
public class MainDeveloper {
    public static void main(String... args) {
        MainDeveloper mainDeveloper = new MainDeveloper();
        mainDeveloper.m();
    }

    public void m() throws InputMismatchException {
        // Создаем обьект класса Программист - велосипедист
        CyclDeveloper cyclDeveloper = new CyclDeveloper();
        cyclDeveloper.setName("Вася - Велосипедист");
        cyclDeveloper.setCityWhereHeLives("Бровары");
        cyclDeveloper.setCityWhereHeWorks("Киев");
        cyclDeveloper.getName();
        cyclDeveloper.getCityWhereHeLives();
        cyclDeveloper.getCityWhereHeWorks();

        // Создаем обьект класса Программист - мотоциклист
        MotoDeveloper motoDeveloper = new MotoDeveloper();
        motoDeveloper.setName("Гена - Мотоциклист");
        motoDeveloper.setCityWhereHeLives("Бровары");
        motoDeveloper.setCityWhereHeWorks("Киев");
        motoDeveloper.getName();
        motoDeveloper.getCityWhereHeLives();
        motoDeveloper.getCityWhereHeWorks();

        // Создаем обьект класса Программист - на общ. транспорте
        PublicTransportDeveloper publicTransportDeveloper = new PublicTransportDeveloper();
        publicTransportDeveloper.setName("Семен - нищеброд");
        publicTransportDeveloper.setCityWhereHeLives("Бровары");
        publicTransportDeveloper.setCityWhereHeWorks("Киев");
        publicTransportDeveloper.getName();
        publicTransportDeveloper.getCityWhereHeLives();
        publicTransportDeveloper.getCityWhereHeWorks();


        String[] weatherTypes = {"0: Очень сухая погода", "1: Обычная погода", "2: Дождливая погода", "3: Выход из программы"};
        for (String elem : weatherTypes)
            System.out.println(elem);

        boolean runWhile = true;
        while (runWhile) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите цифру:");
            try {
                int k = scan.nextInt();

                if (k == 0) {
                    motoDeveloper.printAboutMe();
                    motoDeveloper.earnings(0);
                    System.out.println();
                    cyclDeveloper.printAboutMe();
                    cyclDeveloper.earnings(0);
                    System.out.println();
                    publicTransportDeveloper.printAboutMe();
                    publicTransportDeveloper.earnings(0);
                    System.out.println("**********************************************Вывод: ");

                    if (cyclDeveloper.money > motoDeveloper.money && cyclDeveloper.money > publicTransportDeveloper.money) {
                        System.out.println("В очень сухую погоду выгоднее ездить на велике");
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                    } else if (motoDeveloper.money > cyclDeveloper.money && motoDeveloper.money > publicTransportDeveloper.money) {
                        System.out.println("В очень сухую погоду выгоднее ездить на мотоцикле");
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                    } else if (publicTransportDeveloper.money > motoDeveloper.money && publicTransportDeveloper.money > cyclDeveloper.money) {
                        System.out.println("В очень сухую погоду выгоднее ездить на общ. транспорте");
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                    }
                } else if (k == 1) {
                    motoDeveloper.printAboutMe();
                    motoDeveloper.earnings(1);
                    System.out.println();
                    cyclDeveloper.printAboutMe();
                    cyclDeveloper.earnings(1);
                    System.out.println();
                    publicTransportDeveloper.printAboutMe();
                    publicTransportDeveloper.earnings(1);
                    System.out.println("**********************************************Вывод: ");

                    if (cyclDeveloper.money > motoDeveloper.money && cyclDeveloper.money > publicTransportDeveloper.money) {
                        System.out.println("В обычную погоду выгоднее ездить на велике");
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                    } else if (motoDeveloper.money > cyclDeveloper.money && motoDeveloper.money > publicTransportDeveloper.money) {
                        System.out.println("В обычную погоду выгоднее ездить на мотоцикле");
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                    } else if (publicTransportDeveloper.money > motoDeveloper.money && publicTransportDeveloper.money > cyclDeveloper.money) {
                        System.out.println("В обычную погоду выгоднее ездить на общ. транспорте");
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                    }
                } else if (k == 2) {
                    motoDeveloper.printAboutMe();
                    motoDeveloper.earnings(2);
                    System.out.println();
                    cyclDeveloper.printAboutMe();
                    cyclDeveloper.earnings(2);
                    System.out.println();
                    publicTransportDeveloper.printAboutMe();
                    publicTransportDeveloper.earnings(2);
                    System.out.println("**********************************************Вывод: ");

                    if (cyclDeveloper.money > motoDeveloper.money && cyclDeveloper.money > publicTransportDeveloper.money) {
                        System.out.println("В дождливую погоду выгоднее ездить на велике");
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                    } else if (motoDeveloper.money > cyclDeveloper.money && motoDeveloper.money > publicTransportDeveloper.money) {
                        System.out.println("В дождливую погоду выгоднее ездить на мотоцикле");
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                    } else if (publicTransportDeveloper.money > motoDeveloper.money && publicTransportDeveloper.money > cyclDeveloper.money) {
                        System.out.println("В дождливую погоду выгоднее ездить на общ. транспорте");
                        System.out.println("зароботок парня на общ. траспорте: " + publicTransportDeveloper.money);
                        System.out.println("зароботок мотоциклиста: " + motoDeveloper.money);
                        System.out.println("зароботок велосипедиста: " + cyclDeveloper.money);
                    }
                } else if (k == 3) {
                    System.out.println("Выход из программы");
                    runWhile = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Не правильно введено число");
            }
        }

    }
}

