package Collections.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Que2 {

	public void show()

	{

	ArrayList<String> list = new
	ArrayList<String>();

	list.add("banana");

	list.add("apple");

	Iterator itr = list.iterator();
	Collections.sort(list);

	while (itr.hasNext()) {

	System.out.print(itr.next() + " ");

	}

	}

	

	

	public static void
	main(String[] args)

	{

		Que2 demo = new Que2();

	demo.show();

	}

	}


