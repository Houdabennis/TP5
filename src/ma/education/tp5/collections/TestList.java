package ma.education.tp5.collections;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class TestList {

    public static void main(String[] args)
    {

        List<Integer> list1= new ArrayList<Integer>();
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        // Accepter les doublons
        list1.forEach(i-> System.out.println(i));

        List<Integer> list2 = Arrays.asList(1,5,6,9,16);
        //list2.stream().map(i->i*i).filter(i->i>37).
        //forEach(i-> System.out.println(i));
        List<Integer> list3= new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        //list3.forEach(i-> System.out.println(i));



    }
}