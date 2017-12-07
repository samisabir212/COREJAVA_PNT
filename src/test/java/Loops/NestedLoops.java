package Loops;

public class NestedLoops {


    public static void main(String[] args) {


        int counter = 1;
        for (int i = 1; i<=4; i++) {
            for (int j =i; j<=4; j++) {
                counter++;
                System.out.print(counter);

            }
            System.out.println(" ");

        }

    }
}
