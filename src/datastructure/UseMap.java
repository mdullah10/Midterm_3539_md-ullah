package datastructure;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> cityOFUSA = new ArrayList<String>();
        cityOFUSA.add("New York");
        cityOFUSA.add("Florida");
        cityOFUSA.add("California");
        cityOFUSA.add("new Mexico");
        cityOFUSA.add("taxes");

        List<String> cityOfFrance = new ArrayList<String>();
        cityOfFrance.add("Paris");
        cityOfFrance.add("city1");
        cityOfFrance.add("city2");
        cityOfFrance.add("city3");

        List<String> cityOfSpain = new ArrayList<String>();
        cityOfSpain.add("Madrid");
        cityOfSpain.add("barcelona");
        cityOfSpain.add("A,Madrid");

        Map<Integer, List<String>> map = new LinkedHashMap<>();
        map.put(1, cityOFUSA);
        map.put(2, cityOfFrance);
        map.put(3, cityOfSpain);


        for (Map.Entry<Integer, List<String>> city : map.entrySet()) {
            System.out.println(" ->  " + city.getValue());
        }




    }



    }


