package PNT_Java_Solutions.Selenium_Class_Core_JAVA;

/**
 * Created by sami on 11/21/17.
 */
public class DO_while {



    public static void main(String[] args) {
        int i = 0;

        boolean apple = true;


        //interview question
            // what is difference between do while and do loop


        while (i < 10) {
            System.out.println(i);
            i = i + 2;
        }

        do {
            System.out.println(i);
            i = i + 2;
        } while (i < 20); //<--- condition




    }
}
