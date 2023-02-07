package String;

public class EqualOperator {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		String st1=new String("Hello");
		String st2=new String("Hello");
		System.out.println(str==str1);
		System.out.println(str==st2);
		System.out.println(st1==st2);

	}

}
