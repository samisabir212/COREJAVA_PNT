package PNT_Java_Solutions.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {


    public static void main(String[] args) {


        HashMap<Integer, String> hmap1_countryMap = new HashMap<Integer, String>();

        hmap1_countryMap.put(1, "morocco");
        hmap1_countryMap.put(3, "usa");
        hmap1_countryMap.put(5, "china");
        hmap1_countryMap.put(6, "brazil");
        hmap1_countryMap.put(8, "canada");


        hmap1_countryMap.remove(5);


        Set set = hmap1_countryMap.entrySet();

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {

            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print(" key is :: " + mentry.getKey() + " value is: ");
            System.out.print(mentry.getValue());


        }




    }
}