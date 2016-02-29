package tasksOOP.bus;


public class Bus
{
    private int countHuman;
    private String bussType;


    public String getBussType() {return bussType;}
    public void setBussType(String bussType) {this.bussType = bussType;}

    public void addHuman(int countHuman)
    {
        if (countHuman >= 0 && (this.countHuman + countHuman) < 50){
            this.countHuman += countHuman;
            System.out.println("Зашло " + countHuman + " человек");
        } else if (countHuman >= 0 && (this.countHuman + countHuman) >= 50){
            System.out.println("В автобусе " + this.countHuman + " человек, еще " + countHuman + " человек зайти не может");
        } else if (countHuman < 0 && (this.countHuman + countHuman) >= 0){
            this.countHuman += countHuman;
            System.out.println("Вышло " + (-countHuman) + " человек");
        } else if (countHuman < 0 && (this.countHuman + countHuman) < 0){
            System.out.println("В автобусе " + this.countHuman + " человек, " + (-countHuman) + " людей выйти не может");
        }
    }

    public void printAboutMe()
    {
        String [] operationNames = {"+(int) Люди заходят", "-(int) Люди выходят"};
        for (String elem: operationNames)
            System.out.println(elem);
        if (this.countHuman == 0) {System.out.println("В автобусе никого нету - выйти никто не может");}
        else {System.out.println("Сейчас в автобусе " + this.countHuman + " человек");}
    }
}
