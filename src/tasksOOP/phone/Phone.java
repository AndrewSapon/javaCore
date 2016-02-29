package tasksOOP.phone;

import java.util.Random;


public class Phone {
    private static Phone[] phones = new Phone[10];

    private String myNumber;
    private String marka;
    private static int countPhones;

    // Метод проверяет есть ли телефон в базе
    public static boolean isNumberExist(String number) {
        boolean a = false;

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && (phones[i].getMyNumber()).equals(number)) {
                a = true;
                break;
            } else a = false;
        }
        //  System.out.print("Есть ли телефон в базе? - ");
        return a;
    }

    // Возвращает случайный телефон из базы
    public static Phone getRandomPhone() {
        Random random = new Random();
        // Random  создает рендомные значения int nextInt(int n)  от 0 до n
        // Так как countPhones - счетчик созданных обьектов класса Phone, используем его для задания кол-ва обьектов из которых выбирать n
        Phone p = phones[random.nextInt(countPhones)];
        return p;
    }

    // call(String number) - выводит на экран "телефон такой-то(номер+марка) звонит такому-то(номер+марка)"
    public void call(String number) {
        if (isNumberExist(number))
            if (!number.equals(this.getMyNumber()))
                System.out.println("Телефон, марка:" + this.getMarka() + ", номер: " + this.getMyNumber() + " звонит на телефон" + number);
    }

    // в Конструкторе, сразу добавляем телефон в базу, при создании
    // countPhones - статический счетчик созданных экземпляров
    public Phone(String myNumber, String marka) {
        this.myNumber = myNumber;
        this.marka = marka;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                phones[i] = this;
                break;
            }
        }
        countPhones++;
    }

    public String getMyNumber() {return myNumber;}
    public String getMarka() {return marka;}
    public static int getCountPhones() {return countPhones;}
    public static Phone[] getPhones() {return phones;}
}