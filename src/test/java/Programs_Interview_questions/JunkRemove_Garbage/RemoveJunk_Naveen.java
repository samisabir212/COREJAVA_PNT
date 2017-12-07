package Programs_Interview_questions.JunkRemove_Garbage;

public class RemoveJunk_Naveen {


    public static void main(String[] args) {


        String s = "*&^&&^% THUNDERCAR &$%^&&";
        String sloppyText = "&^%&^%& 1234 &*^*^%$ abcd %^&*^%6789";
        String distrortedtext = "Selenium**&*&*& java (*(*((";



                //replace all with a regular espression
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);



        String fixMytext = sloppyText.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(fixMytext);

        String NotDistorted = distrortedtext.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(NotDistorted);





    }

}

