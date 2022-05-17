package collection.Framework;
//user defined list test class

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student ();
		  s1.setRollno(11);
		  s1.setName("abc");
		
		Student s2 = new Student ();
		  s2.setRollno(12);
		  s2.setName("xyz");
		  
	 List l = new ArrayList();
	  l.add(s1);
	  l.add(s2);
	 
	  Iterator itr = l.iterator();
	  while(itr.hasNext())
	  {
		  Student ss = (Student)itr.next();
		  System.out.println(ss.getRollno());
		  System.out.println(ss.getName());
		  
	  }

	}

}
