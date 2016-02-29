package serialization;

import java.io.Serializable;


class Engine implements Serializable{
    private String number;

    public Engine() {
        this.number = "BB" + (int)(1000*Math.random());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public Engine clone() throws CloneNotSupportedException{
        Engine eng1 = (Engine)super.clone();
        return eng1;
    }
    @Override
    public String toString() {
        return "Engine [number=" + number + "]";
    }

}

