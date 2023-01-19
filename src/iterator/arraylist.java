package iterator;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.collections4.iterators.ArrayListIterator;

public class arraylist {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(null);
	al.add('a');
	al.add("sita");
	
	Iterator itr = al.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
