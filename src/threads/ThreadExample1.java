package threads;

/**
 В данном примере видно как отрабатывает основной поток, а также 3 соданных
 Управление потоками осуществляет планировщик потоков
 Есть несколько способов работы с потоками:
 1) extends Thread --> run();
 2) implements Runnable --> run().
 Способы остановки потоков:
 1) obj.stop() - не желательный
 2) Установка флажка для  остановки потока
 obj.interrupt  - установить флажек
        isInterrupted  - проверить флажек
 3) obj.Daemon() - демонический)  Остановка, когда останавливается главный поток
 4) obj.join() - заставляет текущий поток дождаться выполнения того потока, для которого вызван метод join
 Получить состояние: obj.getState():
 - New;
 - Runnable;
 - Waiting/Time_Waiting/BLOkCED;
 - Terminate.
 Проверить живой ли поток: isAlive().
 Методы wait() & notify(), notifyAll должны находиться внутри блока sinchronized (sinchronized метода)
 */
public class ThreadExample1 {
    public static void main(String[] args) {
        FirstThread obj1 = new FirstThread("Thr1");
        FirstThread obj2 = new FirstThread("\tThr2");
        FirstThread obj3 = new FirstThread("\t\tThr3");

        obj1.start();
        obj2.start();
        obj3.start();

        System.out.println("end!!!!!!!!!!!!!!!!!!!!!!!!1");
    }
}

class FirstThread extends Thread {
    private String name;

    public FirstThread(String n) {
        name = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + "_" + i);
        }
    }
}

