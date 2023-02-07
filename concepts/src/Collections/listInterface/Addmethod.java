package Collections.listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Addmethod {

	public static void main(String[] args) {
		List<Integer> val=new ArrayList<>();
		val.add(0);
		val.add(11);
		val.add(23);
		
		Iterator z=val.iterator();
		while(z.hasNext()) {
			System.out.println(z.next());
			
		}
		System.out.println(val);
		/*
		 * for(Integer e: val) { System.out.println(e); }
		 * System.out.println("ArrayList: "+val);
		 */
	}

}
