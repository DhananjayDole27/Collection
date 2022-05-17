package collection.Framework;
// Arraylist retrive element by using iterator method

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {

	public static void main(String[] args) {
		List l = new ArrayList();
		 l.add(10);
		 l.add(20);
		 l.add(30);
		 l.add(40);
		Iterator itr =  l.iterator();
		 while (itr.hasNext())
		 {
			 int x = (int) itr.next();
			 System.out.println(x);
		 }
	}

}
