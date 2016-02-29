package compareTo;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Product implements Comparable {
    private String name;
    private double price;
    private Calendar date;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Calendar getDate() {
        return date;
    }

    public Product(String name, double price, Calendar date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    @Override
    public int compareTo(Object obj) {
        Product product = (Product) (obj);
        return this.name.compareTo(product.getName());
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return name + " " + price + " " + format.format(date.getTime()) + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) (obj);
        return this.getName().equals(product.getName());
    }

}