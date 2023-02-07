package inheritance;

//When a class inherits another class, it is known as a single inheritance.

class Animal{
	void eat() {
		System.out.println("eating..");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("barking..");
	}
}


////When a class inherits another class, it is known as a single inheritance.
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping...");
	}
}
 class DemoInheritance {
	 public static void main(String args[]) {
		////When a class inherits another class, it is known as a single inheritance.
		 Dog d = new Dog();
		d.bark();
		d.eat(); 
		 
		////When a class inherits another class, it is known as a single inheritance.
		 BabyDog b = new BabyDog();
		 b.bark();
		 b.eat();
		 
	 }
}
