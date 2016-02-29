package tasksOOP.lift;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Andrew on 29.12.2015.
 */

public class MainLift{

    private static int readFloat(Scanner s) throws MyException{
        int num = s.nextInt();
        if(num <= 0 || num > 5)
        {
            throw new MyException("Этаж не существует");
        }

        return num;
    }
    static int inLift = 0;
    private static int readPeople(Scanner s) throws MyException{
        int num = s.nextInt();
        int tmp = num + inLift;
        if(tmp > 4)
            throw new MyException("Не входят в лифт");
        else if(tmp < 0)
            throw new MyException("В лифте нет столько людей");
        else
            System.out.println("В лифте изменения " + tmp + " людей");
        System.out.println("Введите следующий этаж [1. 2. 3. 4. 5]: ");
        return num;
    }

    public static void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Lift lift = Lift.getLift();
        boolean test = true;
        while (test){
            Scanner s = new Scanner(System.in);
            try {
                lift.printAboutMe();
                System.out.println("Введите сколько людей зашло или вышло");
                lift.move(readPeople(s), readFloat(s));
            }catch (MyException e){
                System.err.println(e.getMessage());
            } catch (InputMismatchException e){
                continue;
            }
        }
    }
}