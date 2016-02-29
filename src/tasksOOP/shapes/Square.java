package tasksOOP.shapes;

public class Square extends Rectangle
{

    public Square(double x, double y, double a)
    {
        super(x, y, a, a);
    }

    @Override
    public double getPerimetr()
    {
        System.out.print(" Периметр квадрата: ");
        return (getSideA() * 4);
    }

    @Override
    public double getSquare()
    {
        System.out.print(" Площадь квадрата: ");
        return (Math.pow(getSideA(), 2));
    }
}

