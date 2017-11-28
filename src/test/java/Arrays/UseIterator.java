package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("usa");
        list.add("china");
        list.add("morocco");

        Iterator it = list.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }
    }
}
