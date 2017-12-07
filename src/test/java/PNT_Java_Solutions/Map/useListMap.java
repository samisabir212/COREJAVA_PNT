package PNT_Java_Solutions.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sami on 11/16/17.
 */
public class useListMap {


    public static void main(String[] args) {

        //list of array list
        List<String> usa_cities = new ArrayList<>();

        usa_cities.add("VA");
        usa_cities.add("NY");
        usa_cities.add("LA");


        List<String> canada_cities = new ArrayList<>();

        canada_cities.add("montreal");
        canada_cities.add("toronto");

        List<String> morocco_cities = new ArrayList<>();


        morocco_cities.add("rabat");
        morocco_cities.add("casablanca");
        morocco_cities.add("kenitra");


        //map class store key, value using linkedhashmapclass
        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("USA", usa_cities);
        map.put("CANADA", canada_cities);
        map.put("MOROCCO", morocco_cities);


        //for Map class entries called entry in map instance
        //print the key and values of each list in the linkedhashmap MAP
        for (Map.Entry entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}
