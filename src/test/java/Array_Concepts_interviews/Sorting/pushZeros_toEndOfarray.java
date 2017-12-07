package Array_Concepts_interviews.Sorting;

public class pushZeros_toEndOfarray {




    public static void main(String[] args) {

        int[] a = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        int k = a.length;
        int j = 0;
        int b[] = new int[11];
        for (int i = 0; i<k; i++) {

            if (a[i] != 0) {
                b[j] = a[i];
                j++;
            }
        }

        for (int g = 7; g<11; g++) {

            b[g] = 0;
        }

        for (int c = 0; c< 11; c++) {

            System.out.print(b[c]);

        }
    }



}
