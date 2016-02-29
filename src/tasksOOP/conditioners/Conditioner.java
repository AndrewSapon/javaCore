package tasksOOP.conditioners;


public class Conditioner
{
    private int temperature;
    private boolean statusCondition = false;

    public Conditioner() {}

    public int getTemperature() {return temperature;}
    public boolean isStatusCondition() {return statusCondition;}
    public void setTemperature(int temperature) {this.temperature = temperature;}
    public void setStatusCondition(boolean statusCondition) {this.statusCondition = statusCondition;}

}


