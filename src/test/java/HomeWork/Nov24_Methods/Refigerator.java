package HomeWork.Nov24_Methods;

import java.sql.Ref;
import java.util.List;

public class Refigerator {



    public static void main(String[] args) {

        Refigerator fridge = new Refigerator();

        fridge.openFridge("opened");

        freezer fz = new freezer();

        fz.openFreezer("teeth");

        fridge.calculateFrozenFish();





    }


    public void openFridge(String action) {

        System.out.println("I " + action + " fridge");

    }

    public void calculateFrozenFish() {

        freezer fz = new freezer();

        fz.addFish();
    }


    public static class freezer {


        int salmonCount = 4;
        int flounderCount = 2;
        int shrimpCount = 3;
        int codCount = 2;

        public void openFreezer(String action) {

            System.out.println("I opend the freezer with my " + action);

        }

        public void addFish() {

            int sumOfTotalFish = salmonCount + flounderCount + shrimpCount + codCount;

            System.out.println("total amount of fish in freezer is "+ sumOfTotalFish);

        }

    }


}
