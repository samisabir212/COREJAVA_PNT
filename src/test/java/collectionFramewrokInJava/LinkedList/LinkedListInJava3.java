package collectionFramewrokInJava.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava3 {

	public static void main(String[] args) {


		List<String> linkedList = new LinkedList<String>();

		linkedList.add("50");
		linkedList.add("50");
		linkedList.add("O_n_Squared_duplicate_values");
		linkedList.add("100");
		linkedList.add("true");
		linkedList.add("50");

		System.out.println(linkedList);
		//linkedList.clear();
		System.out.println(linkedList);
		
		System.out.println(linkedList.isEmpty());
		
		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("50");
		linkedList1.add("50");
		linkedList1.add("O_n_Squared_duplicate_values");
		linkedList1.add("100");
		linkedList1.add("true");
		linkedList1.add("50");


		LinkedList<String> mylinkedlist1 = new LinkedList<String>();

		mylinkedlist1.addAll(0, linkedList1);

		mylinkedlist1.add("i just added this one");



		System.out.println(linkedList1);

		System.out.println("this is the copy of linked list1" + mylinkedlist1);
	}

}
