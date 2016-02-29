package tasksOOP.shapes;

import java.util.ArrayList;

/**
 * Полиморфизм - возможность работать с обьектами разных типов единым образом (Полиморфизм всегда возможен только при наследовании)
 * instanceof - является ли переменная экземпляром класса или наследника
 * Переопределение - процесс замены метода базового класса - своим методом в наследнике
 * Аннотация @Overide - это просьба к компилятору проследить переопределение =)
 * Не наследутся поля и методы static, private и конструкторы
 */
public class MainShape {
    private static ArrayList<Shape> list = new ArrayList<Shape>();

    public static void main(String... args) {
        Shape shape = new Rectangle(0, 0, 2, 4);
        Shape shape1 = new Square(0, 0, 2);
        Shape shape2 = new Circle(0, 0, 2);
        Shape shape3 = new Triangle(0, 0, 2, 2);

        list.add(shape);
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getPerimetr());
            System.out.println(list.get(i).getSquare());
        }
    }
}

