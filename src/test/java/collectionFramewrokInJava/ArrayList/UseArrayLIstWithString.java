package collectionFramewrokInJava.ArrayList;

import java.util.ArrayList;

public class UseArrayLIstWithString {

    public static void main(String[] args) {

        UseArrayLIstWithString obj = new UseArrayLIstWithString();

        obj.arrayMethod1();
        ArrayList<String> stList = new ArrayList<String>();

        stList.add("china");
        stList.add("London");

        for (int i = 0; i<3; i++) {

            System.out.println(stList.get(i));

        }
        for (String st : stList) {

            System.out.println(st);
        }
    }

    public void arrayMethod1() {

        ArrayList<String> stList = new ArrayList<String>();

        stList.add("morocco");
        stList.add("Ghana");

        for (String st : stList) {
            System.out.println("my country could be " + st);

        }
    }
}
