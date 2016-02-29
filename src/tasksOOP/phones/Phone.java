package tasksOOP.phones;


public abstract class Phone {
    private String number;
    private boolean camera;
    private int sideSize; // диагональ экрана
    public static int countPhones;

    // call(String number) - выводит на экран "телефон такой-то(номер+марка) звонит такому-то(номер+марка)"
    public void call(Phone ph) {
        System.out.println("Телефон, марка: " + this.getClass().getSimpleName() + ", номер: " + this.getNumber() + " звонит на телефон " + ph.getClass().getSimpleName() + " номер: " + ph.getNumber());

    }

    public void printModel() {
        System.out.println("Модель телефона" + this.getClass().getSimpleName());
    }

    private Phone() {}
    public Phone(String number, boolean camera, int sideSize) {
        this.number = number;
        this.camera = camera;
        this.sideSize = sideSize;

        countPhones++;
    }

    public String getNumber() {
        return number;
    }
    public boolean isCamera() {
        return camera;
    }
    public int getIntSize() {
        return sideSize;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setCamera(boolean camera) {
        this.camera = camera;
    }
    public void setIntSize(int sideSize) {
        this.sideSize = sideSize;
    }
}

