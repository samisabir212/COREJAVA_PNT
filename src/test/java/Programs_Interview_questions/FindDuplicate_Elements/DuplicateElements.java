package Programs_Interview_questions.FindDuplicate_Elements;

public class DuplicateElements {


    public static void main(String[] args) {


        String names[] = {"Java", "C#", "Python", "JavaScript", "Java"};

        //1. compare each element
        int len = names.length;

        for (int i = 0; i<len; i++) {
            for (int j = i + 1; i < len; j++) {

                if (names[i].equals(names[j])) {

                    System.out.println("Dup is :: " + names[i]);
                }
            }
        }






    }
}
