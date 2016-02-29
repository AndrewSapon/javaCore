package serialization;


import java.io.Serializable;
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    public Product(String n){
        name = n;
    }
    public String toString(){
        return name;
    }
}
