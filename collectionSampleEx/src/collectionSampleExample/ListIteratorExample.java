package collectionSampleExample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> litr = list.listIterator();

        System.out.println("Forward direction:");
        while (litr.hasNext()) {
            String val = litr.next();
            System.out.println(val);

            if (val.equals("B")) {
                litr.add("X");   // add element
            }
        }

        System.out.println("Backward direction:");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        System.out.println("Final List: " + list);
    }
}
