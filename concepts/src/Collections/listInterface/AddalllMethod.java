package Collections.listInterface;

import java.util.ArrayList;
import java.util.List;

public class AddalllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> val1 = new ArrayList<>();

		val1.add("corona can be stopped");

		List<String> val2 = new ArrayList<>();

		val2.add("stay at home");

		val1.addAll(val2);

		System.out.println(val1);
	}

}
