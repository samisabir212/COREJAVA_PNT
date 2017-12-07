package Programs_Interview_questions.String_Manipulations;

public class ComparingStrings {


    public static void main(String[] args) {


        String str1 = "i love selenium, i will get a job";
        String str2 = "i love selenium, i will get a Job";

        if (str1 == str2) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }


        //USE THE EQUALS METHOD to compare strings

        if (str1.equals(str2)) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }

        //equals method prints out a true false output because its a boolean type method
        System.out.println(str1.equals(str2));


        System.out.println(str1.equalsIgnoreCase(str2)); //ignore the case sensitivity


        //substring
        System.out.println(str1.substring(0, 9));//returns a range of strings

        //trim
        String s = "    hello selenium  ";
        //trim method
        System.out.println(s.trim());//removes empty white spaces

        System.out.println(s.replaceAll(" ", "")); //remove the empty space between strings


        String date = "10-10-2090";
        //replace the date string from - to /
        System.out.println(date.replace("-", "/"));



    }
}
