package Programs_Interview_questions.ReverseStringAndMore;

public class ReverseString {


    public static void main(String[] args) {

        ReverseString rev = new ReverseString();

        rev.reverseString("abcd");
       // rev.reversethisString(" there is a crazy person in this room");

    }



    public void reverseString(String a) {


        for (int i = a.length() - 1; i >= 0; i--) {

            System.out.print(a.charAt(i));

        }

    }

    public void reversethisString(String myString) {

        for (int i = myString.length() - 1; i>=0; i--  ) {

            System.out.print(myString.charAt(i));

        }
        System.out.println("not reversed");
    }
}
