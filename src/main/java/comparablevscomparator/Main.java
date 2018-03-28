package comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops= new ArrayList<>();
        laptops.add(new Laptop("Dell",16,800));
        laptops.add(new Laptop("Apple",8,1900));
        laptops.add(new Laptop("Acer",12,700));
        laptops.add(new Laptop("Lenevo",12,700));

        Comparator<Laptop> comp = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice()>o2.getPrice())
                    return 1;
                if (o1.getPrice()<o2.getPrice())
                    return -1;
                else
                    return 0;
            }
        };

        Collections.sort(laptops,comp);
        for(Laptop l:laptops){
            System.out.println(l);
        }
    }
}
