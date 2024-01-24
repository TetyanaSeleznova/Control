package company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Industrial> ar = new LinkedList <>();
        ar.add(new Industrial("Заводское","Сумская", 1877, 4.5));
        ar.add(new Industrial("Заводское","Рымарская", 1978, 6.8));
        ar.add(new Industrial("Заводское","Гоголя", 2009, 2.9879));
        ar.sort(Comparator.comparing(Industrial:: getNumber));
        for (Industrial d : ar){
            d.build();
        }
        ArrayList<Flat> ar1 = new ArrayList<>();
        ar1.add(new Flat(25, "Маяковского", 1966, 8.1) );
        ar1.add(new Flat(55, "Фрунзе", 1876, 8.1) );
        ar1.add(new Flat(44, "Шевченко", 2000, 8.1) );
        Collections.reverse(ar1);
        for (Flat s : ar1){
            s.build();
        } }
}

