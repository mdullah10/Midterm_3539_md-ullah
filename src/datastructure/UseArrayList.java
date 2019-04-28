package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */


        ArrayList<String> ar1 = new ArrayList<>();

        ar1.add("java world");
        ar1.add("md Ullah");
        ar1.add("Selenium");
        ar1.add("dhaka");
        ar1.add("Bangladesh");

        System.out.println(ar1.size());

        for (int i = 0; i < ar1.size(); i++) {
            System.out.println(ar1.get(i));
        }
        ar1.remove(1);
        System.out.println(ar1.size());

        for (int i = 0; i < ar1.size(); i++) {
            System.out.println(ar1.get(i));
        }
        int j = ar1.size();
        while (j <= ar1.size()) {
            System.out.println(j++);
        }

        Iterator<String> it = ar1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}