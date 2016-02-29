package tasksOOP.phone;

/**
 * Телефон:
 * Создать класс Phone с полями:
 * - static Phone[] phones = new Phone[10];
 * - String myNumber
 * - String marka
 * Изначально phones не содержит телефонов, все телефоны добавляются через конструктор.
 * При создании нового объекта-телефона, мы должны указать его номер и он вносится в базу номеров phones.
 * В этот класс добавить метод:
 * - isNumberExist(String number) - проверяет наличие телефона в базе
 * - call(String number) - выводит на экран "телефон такой-то(номер+марка) звонит такому-то(номер+марка)"
 * - getRandomPhone() - возвращает случайный телефон из базы телефонов
 * Ограничение в 10 телефонов.
 * В MainPhone:
 * - создать несколько телефонов с какими-то номерами
 * - попробовать проверить наличие существующего и несуществующего номера.
 * - для случайного телефона вызвать метод call и пусть звонит на случайный телефон.
 */
public class MainPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0938764532", "Nokia");
        Phone phone2 = new Phone("0938764535", "Samsung");

        for (Phone elem : Phone.getPhones())
            System.out.println(elem);

        System.out.println("Есть ли телефон в базе? - " + Phone.isNumberExist("0938764535"));
        System.out.println("Случайный телефон из базы: " + Phone.getRandomPhone().toString());
        System.out.println("Кол-во телефонов в базе: " + Phone.getCountPhones());
        phone1.call(Phone.getRandomPhone().getMyNumber());
    }

}

