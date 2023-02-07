package Collections.listInterface;

import java.util.ArrayList;
import java.util.List;

public class Removemethod {

	public static void main(String[] args) {
		List<Integer> val=new ArrayList<>();
		val.add(0);
		val.add(23);
		val.add(24);
		val.add(45);
		
		val.remove(1);
		System.out.println("ArrayList: "+val);
	}

}
