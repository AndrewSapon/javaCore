package tasksOOP.developers;

/**
 * Created by Andrew on 30.12.2015.
 */
public class PublicTransportDeveloper {

    private String name;
    private String cityWhereHeLives;
    private String cityWhereHeWorks;
    private int costForTransport = 20;
    private int coastFor1Hour = 35;
    public double money;
    private double workHours;
    private double hoursToWork;

    PublicTransportDeveloper() {
    }

    public String getName() {

        return name;
    }

    public String getCityWhereHeLives() {
        return cityWhereHeLives;
    }

    public String getCityWhereHeWorks() {
        return cityWhereHeWorks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCityWhereHeLives(String cityWhereHeLives) {
        this.cityWhereHeLives = cityWhereHeLives;
    }

    public void setCityWhereHeWorks(String cityWhereHeWorks) {
        this.cityWhereHeWorks = cityWhereHeWorks;
    }


    public int statusOfTheWeather;
    /*
       0 - очень сухая погода - время транспортировки уменьшается в 2 раза
       1 - обычная погода
       2 - дождь - время транспортировки увеличивается в 2 раза
    */


    public void earnings(int statusOfTheWeather) {
        if (statusOfTheWeather == 0) {
            System.out.println("Работаю всего " + (workHours = 8) + " часов");
            System.out.println("Время в дороге +" + (hoursToWork = 9 - workHours));
            money = (coastFor1Hour * 8) - costForTransport;
            System.out.println("Зарабатываю за день " + money + " тугриков");
        } else if (statusOfTheWeather == 2) {
            System.out.println("Работаю всего " + (workHours = 5) + " часов");
            System.out.println("Время в дороге +" + (hoursToWork = 9 - workHours));
            money = (coastFor1Hour * 5) - costForTransport;
            System.out.println("Зарабатываю за день " + money + " тугриков");
        } else {
            System.out.println("Работаю всего " + (workHours = 7) + " часов");
            System.out.println("Время в дороге +" + (hoursToWork = 9 - workHours));
            money = (coastFor1Hour * 7) - costForTransport;
            System.out.println("Зарабатываю за день " + money + " тугриков");
        }
    }

    public void printAboutMe() {
        System.out.println("Меня зовут " + name + ". Я живу в городе " + cityWhereHeLives + " и езжу на работу в " + cityWhereHeWorks);
    }
}
