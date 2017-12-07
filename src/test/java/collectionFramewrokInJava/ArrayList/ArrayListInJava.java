package collectionFramewrokInJava.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {
	
	public static void main(String[] args) {


		//List is from collections interface
		
		List arrayList = new ArrayList<List>();
		
		arrayList.add(2);
		arrayList.add(9.8);
		arrayList.add(true); //boolean
		arrayList.add("Test");
		arrayList.add(2);


		System.out.println(arrayList);
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(4);
		arrayList1.add(4);
		arrayList1.add(5);
		arrayList1.add(9);

		System.out.println(arrayList1);


		for (int i = 0; i < arrayList1.size(); i++) {
			//System.out.println(arrayList.get(i));
			//get each object by using the initializer "i"
			System.out.println("for loop iteration " + arrayList.get(i));


		}

		//new way to loop
		for (int temp : arrayList1) {
			System.out.println("New way to loop "+ temp);


		}
		
	}

}
