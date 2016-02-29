package tasksOOP.table;


public abstract class AbstractHuman implements Humanable {
    private AbstractGlass glass = null;
    private String mail; // пол

    public AbstractHuman() {
    }

    public AbstractGlass getGlass() {
        return glass;
    }

    public String getMail() {
        return mail;
    }

    @Override  //setters
    // Взять стакан
    public void takeGlass(AbstractGlass newGlass) {
        if (this.glass == null && newGlass.getHuman() == null) {
            this.glass = newGlass;
            glass.setHuman(this);
        } else
            System.out.println("У человека уже есть стакан");
    }

    @Override
    // Поставить стакан
    public void putGlass() {
        if (glass.getHuman() != null && this.getGlass() != null) {
            glass.setHuman(null);
            this.glass = null;
        } else
            System.out.println("Стакан и так стоит");
    }

    @Override
    // Вылить воду на стол
    public void pourWaterOnTable(AbstractTable table) {
        if (this.getGlass().isGlassStatus() == false)
            this.getGlass().setGlassStatus(true);
        if (glass.getHuman() != null && this.getGlass() != null) {
            System.out.println("Я " + glass.getHuman().getMail() + " вылил воду на стол " + table.getAboutTableNumber());
            table.setTableIsDry(false);
            // System.out.println("Стакан пуст");
        }
    }

    @Override
    // Наполнить стакан водой
    public void fillGlass() {
        if (this.getGlass().isGlassStatus() == false) {
            this.getGlass().setGlassStatus(true);
            System.out.println("Стакан наоплнен");
        } else
            System.out.println("Стакан уже наполнен, сорри");
    }

    @Override
    public void printAboutMe() {
        if (glass.getHuman() != null && this.getGlass() != null)
            System.out.println("Я " + this.glass.getHuman().getMail() + " у меня есть стакан - " + this.glass.getView());
    }
}

