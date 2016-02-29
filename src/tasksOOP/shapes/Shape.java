package tasksOOP.shapes;


public abstract class Shape {
    private double xPos; // координата по Х
    private double yPos; // координата по Y
    private double sideA;   // сторона

    public Shape() {}
    public Shape(double sideA) {
        this.sideA = sideA;
    }
    public Shape(double xPos, double yPos, double sideA) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getPerimetr() {
        return 0;
    }

    public double getSquare() {
        return 0;
    }

}
