package tasksOOP.phones;

/**
 * Также, можно в конструкторе седлать уникальный  private static int appleId;
 */
public abstract class IPhone extends Phone {
    private int appleId;
    public IPhone(String number, boolean camera, int sideSize, int appleId) {
        super(number, camera, sideSize);
        this.appleId = appleId;
    }

    public int getAppleId() {return appleId;}
    public void printAppleId() {
        System.out.println("Телефон, модель: " + this.getClass().getSimpleName() + " c  ID: " + this.getAppleId());
    }
}