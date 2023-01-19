package iterator;

import java.util.Iterator;

import java.util.ListIterator;
import java.util.TreeSet;



public class linkedlist {
public static void main(String[] args) {
TreeSet ts=new TreeSet();
ts.add(45);
ts.add(26627);
ts.add(55);
 Iterator itr=ts.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
}
}
