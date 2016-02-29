package tasksOOP.table;

/**
 Random rand = new Random();
 boolean status = rand.nextBoolean();
 if (status = true)
 this.view = "круглый";
 else
 this.view = "квадратный";
 */
public abstract class AbstractGlass implements Glassable {
    private AbstractHuman human = null;
    private String view;  // Вид стакана, круглый/квадратный
    private boolean glassStatus; // заполнени ли стакан?

    public AbstractGlass() {}
    public String getView() {return view;}
    public AbstractHuman getHuman() {return human;}
    public void setHuman(AbstractHuman human) {this.human = human;}

    public boolean isGlassStatus() {return glassStatus;}
    public void setGlassStatus(boolean glassStatus) {this.glassStatus = glassStatus;}

    @Override
    public void pourFromMe() {

    }


}