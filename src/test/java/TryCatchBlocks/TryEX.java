package TryCatchBlocks;

public class TryEX {


    public static void main(String[] args) {


        try {

            int a = 7;
            int b = 9;

            System.out.println(a - b);

            System.out.println(a + b);

            System.out.println(1 / 0);


        } catch (Exception e) {

            System.out.println("you can divide 1 by 0");

        } finally {

            System.out.println("finally done");
        }



    }
}
