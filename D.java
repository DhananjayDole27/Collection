package collection.Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D {

	public static void main(String[] args) {
		List l = new ArrayList();
		 l.add(10);
		 l.add(20);
		 l.add(30);
		 l.add(40);
		 l.add("abc");
		 l.add('a');
		Iterator itr = l.iterator();
		while (itr.hasNext())
		{
			Object x = itr.next();
			if (x instanceof Integer)
			{
				int i = (int)x;
				System.out.println(i);
			}
			else if (x instanceof String)
			{
				String s = (String) x;
				System.out.println(s);
			}
		
			else if (x instanceof Character)
			{
				char c = (char)x;
				System.out.println(c);
			}
					
		}
		 

	}

}
