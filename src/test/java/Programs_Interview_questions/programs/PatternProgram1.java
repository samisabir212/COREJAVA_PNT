package Programs_Interview_questions.programs;

public class PatternProgram1 {

	/**
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

	 */
	public static void main(String[] args) {


		for(int i = 1;i<=7;i++){

			for(int j=1; j<=i;j++){

				System.out.print(j+" "); //print index of j as it increments
			}
			System.out.println();
		}
	}
}
