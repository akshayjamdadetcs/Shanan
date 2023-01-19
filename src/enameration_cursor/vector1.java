package enameration_cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class vector1 {
	public static void main(String[] args){
		ArrayList al=new ArrayList<>();
		al.add(null);
		al.add(67);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	}
}
