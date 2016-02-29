package tasksOOP.shapes;


public class Rectangle extends Shape {
    private double sideB;

    public Rectangle(double x, double y, double a, double b) {
        super(x, y, a);
        this.sideB = b;
    }

    @Override // аннотация (не забыть переопределить (уточнить) метод)
    // если есть анотация - то сигнатура должна четко совпадать с родителем
    public double getPerimetr() {
        System.out.print(" Периметр прямоугольника: ");
        return (sideB + getSideA()) * 2;
    }

    @Override
    public double getSquare() {
        System.out.print(" Площадь прямоугольника: ");
        return sideB * getSideA();
    }
}

