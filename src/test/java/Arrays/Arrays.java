package Arrays;

/**
 * Created by sami on 11/22/17.
 */
public class Arrays {

    public static void main(String[] args) {


        int[] myInts = {1, -1, 0, -4, -2, 5, 7, -8, 10, -20};


        /*print out which numbers are negative and print the positve numbers*/

        for (int i = 0; i < myInts.length; i++) {

            if (myInts[i] > 0) {
                System.out.println(myInts[i] + " my positive numbers" );
            } else if (myInts[i] < 0) {
                System.out.println(myInts[i] + " my negativ numbers");
            } else {
                System.out.println(myInts[i] + " zero");
            }

        }

    }
}
