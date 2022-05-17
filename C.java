package collection.Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C {
	

		public static <string> void main(String[] args) {
			List<String> l = new ArrayList<>();
			 l.add("Hello");
			 l.add("World");
			 l.add("and");
			 l.add("space");
			Iterator <string>itr =  (Iterator<string>) l.iterator();
			 while (itr.hasNext())
			 {
				 String name =  (String) itr.next();
				 System.out.println(name);
			 }
		}

	}


