package Loops;

public class ForLoop {


    public static void main(String[] args) {

        ForLoop fl = new ForLoop();

        for (int i = 0 ; i < 10; i++) {

            fl.move("left",10);

        }



    }


    public void move(String direction, int TotalSteps) {

        System.out.println(" the spaceship is moving " + " steps" + " to the " + direction);


    }
}
