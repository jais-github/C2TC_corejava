package inheritance;
//To invoke immediate parent class method

class Animalls{
	void eat() {
		System.out.println("eating..");
	}
}

class Doggs extends Animalls {
	void eat() {
		System.out.println("eating bread..");
	}
	
	void bark() {
		System.out.println("barking..");
	}
	
	void work() {
		super.eat();
		bark();
	}
}
class Annimalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doggs d = new Doggs();
		d.work();
	}

}
