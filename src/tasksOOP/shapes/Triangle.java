package tasksOOP.shapes;

public class Triangle extends Shape
{
    private double sideB;
    private double sideC;

    public Triangle(double x, double y, double a, double b)
    {
        super(x, y, a);
        this.sideB = b;
        this.sideC =  Math.sqrt(Math.pow(a, 2) + Math.pow(b,  2));
    }


    @Override
    public double getPerimetr()
    {
        System.out.print(" Периметр треугольника: ");
        return (sideB + sideC + getSideA());
    }

    @Override
    public double getSquare()
    {
        System.out.print(" Площадь треугольника: ");
        return (0.5 * sideB * getSideA());
    }
}
