package GENERICS;

import cucumber.api.java.gl.E;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Generic_example {


    public static void main(String[] args) {

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("whatever");
        Set<String> mySet2 = new HashSet<String>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("laptop");


       Set<String> resultSet = union(mySet1, mySet2);

        Iterator<String> itr = resultSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }


    }


    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {

        Set<E> result = new HashSet<>(set1);

        result.addAll(set2);
        return result;
    }
}
