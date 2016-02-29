package threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
  Создать поток, который будет каждые 2 секунды выводить текущее время на экран.
  Сделать возможность прерывания потока с помощью команды с консоли.
  interrupt ставит флажек для прерывания потока
  isInterrupted проверяет, если есть флажек - прерываем поток
  При работе с интерфейсом Runnable использ. специальный подход с переопределение методов и конструктор
 */
public class SleepDate implements Runnable   // контейнер который внутри хранит обьект потока Thread thread
{
    Thread thread;

    public SleepDate() {
        thread = new Thread(this);
    }

    public static void main(String... args) {
        SleepDate obj = new SleepDate();
        obj.start();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("stop"))
            obj.interrupt();
    }

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()) {
                System.out.println("end");
                break;
            }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
            String a = simpleDateFormat.format(date);
            System.out.println(a);
            // sleepNSeconds(2);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                interrupt();     // or return;
            }
        }
    }

    public boolean isInterrupted() {
        return thread.isInterrupted();
    }

    public void interrupt() {
        thread.interrupt();
    }

    public void start() {
        thread.start();
    }

}

