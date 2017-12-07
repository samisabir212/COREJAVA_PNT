package Array_Concepts_interviews.Sorting;

public class countZerosInArray {


    public static void main(String[] args) {

        int[] myints = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        int k = myints.length;
        for (int i = 0; i<k; i++) {

            if (myints[i] == 0) {

                System.out.println(i);
            }


        }


    }
}
