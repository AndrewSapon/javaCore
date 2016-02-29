package tasksOOP.phones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 HomeTask. Написать класс телефонов.
 - abstract class Phone(String number, boolean camera, int sideSize)
 - class Nokia
 - class Samsung
 - abstract class IPhone{int appleId}
 - class IPhone4
 - class IPhone5
 Что умеют делать:
 - call(Phone ph) - телефон такой-то марки и с таким-то номером звонит такому-то телефон марки и номера
 - printModel()
 - printAppleId()// для айфонов
 Создать класс MainPhone, в котором создать список телефонов.
 Добавить пару телефонов с номерами каждого вида в список.(Nokia, Samsung, IPhone4, IPhone5)
 С консоли считать 2 (индекса)номера телефона и вызвать методы call  с одного номер на второй.
 Для всех телефонов из списка вызвать метод printModel.
 Затем для всех телефонов, для которых возможно вызвать метод printAppleId.
 */
public class MainPhone
{
    public static void main (String ... args)
    {
        ArrayList<Phone> list = new ArrayList<Phone>();
        Phone phone1 = new Nokia("0955956575", false, 2);
        Phone phone2 = new Nokia("0955956570", false, 3);

        Phone phone3 = new Samsung("0635956575", true, 4);
        Phone phone4 = new Samsung("0935956575", true, 5);

        Phone phone5 = new IPhone4("0635956575", true, 6, 355877);
        Phone phone6 = new IPhone4("0935956555", true, 5, 398877);

        Phone phone7 = new IPhone5("0635956500", true, 4, 455877);
        Phone phone8 = new IPhone5("0935956505", true, 5, 498877);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.add(phone4);
        list.add(phone5);
        list.add(phone6);
        list.add(phone7);
        list.add(phone8);

        for(Phone elem: list)
        {
            elem.printModel();
        }

        for(Phone elem: list)
        {
            if (elem instanceof IPhone){
                ((IPhone) elem).printAppleId();
            }
        }

        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Введите первый телефон: ");
            int a = scan.nextInt();
            System.out.println("Звонить на телефон: ");
            int b = scan.nextInt();
            list.get(a).call(list.get(b));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Под таким индексом нету телефона");
        }
    }
}

