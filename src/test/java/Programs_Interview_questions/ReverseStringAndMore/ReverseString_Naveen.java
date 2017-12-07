package Programs_Interview_questions.ReverseStringAndMore;

public class ReverseString_Naveen {


    //using string buffer class
        //contains reverse function


    public static void main(String[] args) {

        String elementtext = "Selenium";

        StringBuffer sf = new StringBuffer(elementtext);
        System.out.println(sf.reverse());
    }
}
