package compareTo;

import java.util.Comparator;


public class SortProductByPrice implements Comparator<Product>{
    @Override
    public int compare(Product pr1, Product pr2) {
        return (int)(pr1.getPrice() - pr2.getPrice());
    }
}
