package collectionFramewrokInJava.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava2 {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(9);
		System.out.println(arrayList);
		
		List<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(4);
		arrayList1.add(40);
		arrayList1.add(50);
		arrayList1.add(9);

		System.out.println("ArrayList1: "+ arrayList1);
		arrayList.addAll(arrayList1);

		System.out.println(" after adding arraylist1 to arraylist "+arrayList);
		//arrayList.add(2, 600);
		
		arrayList.remove(2);

		
		System.out.println("after removing arraylist1 from arraylist "+arrayList);
		
	}

}
