package HomeWork.Nov24_Methods;

import java.sql.Ref;
import java.util.List;

public class Refigerator {


    public static void main(String[] args) {

        Refigerator fridge = new Refigerator();

        Refigerator frezer = new Refigerator();


        fridge.openFridge("opened");
        frezer.openFreezer();


    }


    public void openFridge(String action) {

        System.out.println("I " + action + " fridge");

    }

    public void openFreezer() {

        boolean freezerOpened = true;

        if (freezerOpened = false) {
            System.out.println("freezer is closes");
        }else{
            System.out.println(" freezer is open");

        }



    }







}
