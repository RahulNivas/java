package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Romita");
		ll.add("Aryan");
		ll.add("Shivay");
		ll.add("Ram");
		ll.add("Ritu");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}