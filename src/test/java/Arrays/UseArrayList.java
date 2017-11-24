package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class UseArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> numList = new ArrayList<Integer>();
        Random rm = new Random();
        for (int i = 0; i<20; i++) {

            numList.add(rm.nextInt(5));
        }
        for (Integer ing : numList) {

            System.out.println(numList.get(ing));

        }

    }
}
