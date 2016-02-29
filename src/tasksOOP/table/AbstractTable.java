package tasksOOP.table;

public abstract class AbstractTable implements Tableable {
    private static int tableNumber = 1;
    private boolean tableIsDry = true;  // стол  сухой?
    private  String aboutTableNumber;
    public AbstractTable()
    {
        aboutTableNumber = "Стол номер: " + tableNumber++;
    }

    public String getAboutTableNumber() {return aboutTableNumber;}
    public boolean isTableIsDry() {return tableIsDry;}
    public void setTableIsDry(boolean tableIsDry) {this.tableIsDry = tableIsDry;}

    @Override
    public boolean isDry()
    {
        return tableIsDry;
    }
}
