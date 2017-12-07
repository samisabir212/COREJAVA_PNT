package PNT_Java_Solutions.ArrayList;

/**
 * Created by sami on 11/21/17.
 */
public class Array {

    //review operators

    //we dont use do loop in testing as much as for and while

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3,4, 5, 6, 7,8};
        String [] stringArray = {"apple", "cucumber", "pears"};


        for (int i = 1; i < array1.length; i = i+2) {
            System.out.println(array1[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] % 2 == 0) { //<-- modular remainder
                System.out.println(array1[i]);
            }
        }
        System.out.println("\n");

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] % 2 == 1) { //<-- modular remainder
                System.out.println(array1[i]);
            }
        }
        System.out.println("\n");

        for (int i = 0; i < array1.length; i++) {

            if (array1[i]%2!=0) { //<-- modular remainder
                System.out.println(array1[i]);
            }else{

                System.out.println(array1[i]);
            }
        }

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != -1) {
                System.out.println("not negative");
            }
        }
/*
* to print an array make sure you get the length
* */
        for (int i =0; i<array1.length; i++) {

           // System.out.println(array1[i]);
        }

        for (int j=0; j<stringArray.length; j++) {
          //  System.out.println(stringArray[j]);

        }




       /* for (array:array1) {
            System.out.println(array1);

        }*/

       //reverse a string in a interview
    }
}
