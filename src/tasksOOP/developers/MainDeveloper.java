package tasksOOP.developers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Задача Программисты в Уругвае.
 Developer
 (Developer1, Developer2, Developer3, MainDeveloper)
 Есть три программиста, которые живут в городе А, а работают в городе В.
 Программисты просыпаются в 8-55 и успевают за 5 минут умыться, одеться  и перекусить.
 В 9-00 они выходят из дома.
 Первый программист отправляется на работу на мотоцикле и в обычную погоду доезжает за 1 час.
 Второй перемещается на общественном транспорте и доезжает за 2 часа.
 Третий перемещается на велосипеде и доезжает за 3 часа.
 Стоимость проезда на общественном транспорте составляет 20 тугриков.
 Стоимость проезда на мотоцикле составляет 80 тугриков.
 На велосипеде бесплатный проезд.
 Если льет дождь, то время транспортировки каждым видом транспорта увеличиваются в два раза(от обычной погоды).
 Если очень сухая погода, то время транспортировки уменьшается в два раза(от обычной погоды).
 1 час работы оплачивается как 35 тугриков.
 Длительность рабочего дня в этой стране ограничено до 18-00(без обеда).
 Определить какой программист больше будет заработает: при обычной погоде, при дожде и при очень сухой погоде.
 Определите, какой вид транспорта предпочтительней для каждого из 3-х видов погоды.
 */
public class MainDeveloper {
    public static void main(String... args) {
        MainDeveloper mainDeveloper = new MainDeveloper();
        mainDeveloper.start();
    }

    public void start() {
        // Создаем экземпляр класса Программист - велосипедист
        CyclDeveloper cyclDeveloper = new CyclDeveloper();
        cyclDeveloper.setName("Вася - Велосипедист");
        cyclDeveloper.setCityWhereHeLives("Бровары");
        cyclDeveloper.setCityWhereHeWorks("Киев");
        cyclDeveloper.getName();
        cyclDeveloper.getCityWhereHeLives();
        cyclDeveloper.getCityWhereHeWorks();

        // Создаем экземпляр класса Программист - мотоциклист
        MotoDeveloper motoDeveloper = new MotoDeveloper();
        motoDeveloper.setName("Гена - Мотоциклист");
        motoDeveloper.setCityWhereHeLives("Бровары");
        motoDeveloper.setCityWhereHeWorks("Киев");
        motoDeveloper.getName();
        motoDeveloper.getCityWhereHeLives();
        motoDeveloper.getCityWhereHeWorks();

        // Создаем экземпляр класса Программист - на общ. транспорте
        PublicTransportDeveloper publicTransportDeveloper = new PublicTransportDeveloper();
        publicTransportDeveloper.setName("Семен - нищеброд");
        publicTransportDeveloper.setCityWhereHeLives("Бровары");
        publicTransportDeveloper.setCityWhereHeWorks("Киев");
        publicTransportDeveloper.getName();
        publicTransportDeveloper.getCityWhereHeLives();
        publicTransportDeveloper.getCityWhereHeWorks();

        // консольное меню
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

