package collectionSampleExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String lang = itr.next();
            System.out.println(lang);

            if (lang.equals("Python")) {
                itr.remove();   
            }
        }

        System.out.println("After removal: " + list);
    }
}
