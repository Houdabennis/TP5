package ma.education.tp5.collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;
public class TestSet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<String> set1 = new HashSet<String>();
        set1.add("C1");
        set1.add("d2");
        set1.add("d3");
        set1.add("C1");
        set1.add("B4");
        set1.add("A5");
        //set1.forEach(i-> System.out.println(i));

        Set<Client> set2 = new HashSet<Client>();

        set2.add(new Client(1,"ALAMI"));
        set2.add(new Client(2,"SOUHAIL"));
        set2.add(new Client(3,"HOUDA"));
        set2.add(new Client(1,"ALAMI"));
        //set2.forEach(i-> System.out.println(i));


        Set<Integer> set3 = new TreeSet<>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        //set3.forEach(i-> System.out.println(i));
        Set<Client> set4 = new TreeSet<>();
        Comparator<Client> c = new CodeComparator();

        set4.add(new Client(1,"OMAR"));
        set4.add(new Client(4,"malik"));
        set4.add(new Client(3,"SAID"));
        set4.add(new Client(2,"HASSAN"));
        set4.forEach(i-> System.out.println(i));
    }
}
