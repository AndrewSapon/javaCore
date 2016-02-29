package tasksOOP.plane;

import java.util.Scanner;

/**
 * Created by Andrew on 29.12.2015.
 */
public class MainPlane
{
    public static void main (String [] args)
    {
        Plane plain = new Plane();
        plain.setPlaneType("AN - 24");
        plain.setAirLinesType("Aerosvit");
        System.out.println("Самолет " + plain.getPlaneType() + ", авиакомпании " + plain.getAirLinesType());

        Scanner scan = new Scanner(System.in);
        boolean runWhile = true;

        while (runWhile)
        {
            plain.printAboutMe();
            int k = scan.nextInt();

            switch (k)
            {
                case 0: plain.up(); System.out.println(); break;
                case 1: plain.down(); System.out.println(); break;
                case 2: runWhile = false; System.out.println("Выход из программы");
            }
        }
    }
}
