package tasksOOP.conditioners;

/**
 * Task. Написать класс BlockConditioners, Conditioner и MainConditioners.
 * Класс BlockConditioners-это набор кондишнов.
 * В блоке управления 10 кондиционеров.
 * Делегирование.
 * Класс Conditioner: int temperature, setTemperature(int k), turnOn(),turnOff(), getTemperature(),?? getTurn() (отображает состояние вкл или выкл булиан и температура, по умолачнию 0)
 * Класс MainConditioner: консольное меню, где вызываются только методы объекта  BlockConditioners.
 * <p>
 * В MainConditioner создание объекта BlockConditioners и вызов мтода этого объекта.
 * <p>
 * Консольное меню:
 * 1. Отобразить состояние всех кондиционеров
 * 2. Включить кондиционер с индексом...
 * 3. Выключить кондиционер с индексом...
 * 4. Установить температуру для кондиционера с индексом...
 * 5. Выход.
 */
public class MainConditioners {
    public static void main(String... args) {
        BlockConditioner b = new BlockConditioner();
        b.start();
    }
}