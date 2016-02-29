package tasksOOP.shapes;

public class Circle extends Shape {

    public Circle(double x, double y, double a) {
        super(x, y, a);
    }

    @Override
    public double getPerimetr() {
        System.out.print(" Периметр круга: ");
        return (Math.PI * getSideA() * 2);
    }

    @Override
    public double getSquare() {
        System.out.print(" Площадь круга: ");
        return (Math.PI * Math.pow(getSideA(), 2));
    }
}
