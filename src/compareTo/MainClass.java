package compareTo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

/**
 Реализовать сортировку продукта по цене
 */
public class MainClass{
    public static void main(String[] args){
        Calendar date1 = new GregorianCalendar(2014,01,01);
        Calendar date2 = new GregorianCalendar(2014,02,01);
        Calendar date3 = new GregorianCalendar(2014,03,01);
        ArrayList<Product> products = new ArrayList();
        products.add(
                new Product("Морковь", 10,new GregorianCalendar(2014,01,01)) );

        products.add(new Product("Морковь",200,date2));
        products.add(new Product("Морковь", 30,date3));
        products.add(new Product("Морковь", 12,date3));
        products.add(new Product("Морковь", 14,date2));
        products.add(new Product("Морковь", 7,date1));
        products.add(new Product("Морковь", 4,date1));

        System.out.println(products);
        System.out.println();

        Collections.sort(products);
        System.out.println(products);
        System.out.println();

        Collections.sort(products, new SortProductByPrice());
        System.out.println(products);

    }
}
