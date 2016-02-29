package tasksOOP.plane;

/**
 * Created by Andrew on 29.12.2015.
 */
public class Plane
{
    private String planeType;
    private String airLinesType;
    public int planeStatus;
    //  1 - /\ - вверху
    // 0 - \/ - внизу


    public void setPlaneType(String planeType)
    {
        this.planeType = planeType;
    }

    public void setAirLinesType(String airLinesType)
    {
        this.airLinesType = airLinesType;
    }

    public String getPlaneType()
    {

        return planeType;
    }

    public String getAirLinesType()
    {
        return airLinesType;
    }

    public void up()
    {
        if (planeStatus == 1){
            planeStatus = 0;
            System.out.println("Я сел");
        } else {
            System.out.println("Я не могу сесть, так как и так внизу");
        }
    }

    public void down()
    {
        if (planeStatus == 0){
            planeStatus = 1;
            System.out.println("Я взлетел");
        } else {
            System.out.println("Я не могу взлетеь, так как и так лечу");
        }

    }

    public void printAboutMe()
    {
        String [] operationNames = {"0: Взлететь", "1: Сесть"};
        for (String elem: operationNames)
            System.out.println(elem);

        if (planeStatus == 0) System.out.println(" Текущий статус - down");
        else System.out.println(" Текущий статус - up");
    }
}
