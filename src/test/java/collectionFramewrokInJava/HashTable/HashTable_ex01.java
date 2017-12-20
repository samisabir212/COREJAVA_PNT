package collectionFramewrokInJava.HashTable;

import com.sun.org.apache.bcel.internal.generic.POP;

import java.util.Hashtable;

public class HashTable_ex01 {


    public static void main(String[] args) {


        Hashtable<String, Integer> Population_By_Country = new Hashtable<String, Integer>();

        Population_By_Country.put("morocco", 10000000);
        Population_By_Country.put("france", 20000000);

        Population_By_Country.put("ghana", 30000000);

        Population_By_Country.put("poland", 40000000);

        Population_By_Country.put("russia", 50000000);

        Population_By_Country.remove("poland");


        System.out.println(Population_By_Country);




    }
}
